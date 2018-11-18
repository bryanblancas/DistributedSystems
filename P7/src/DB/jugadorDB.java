
package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jugadorDB {
	
	private String idJugador;
	private String ip;
	private String nombre;
	DBConnect dbc;
	Connection cx;
	Statement con;
	ResultSet rs;
	
	public jugadorDB(String idJugador, String ip, String nombre) throws SQLException{
		this.idJugador = idJugador;
		this.ip = ip;
		this.nombre = nombre;
		dbc = new DBConnect();
		dbc.setConexion();
		cx = dbc.getConexion();
		con = dbc.getConsulta();
		rs = dbc.getResultSet();
	}
	
	public int registrarJugador() throws SQLException{
		
		try{
			String sql_query="INSERT INTO jugador(idjugador,ip,nombre) value(?,?,?)";
			PreparedStatement statement=cx.prepareStatement(sql_query);

			statement.setString(1,idJugador);
			statement.setString(2,ip);
			statement.setString(3,nombre);

			statement.executeUpdate();
			statement.close();
			
			return 1;
		}catch(Exception e){
			System.out.print("Unabled to insert player");
			System.out.println(e.toString());
			return -1;
		}
		
	}
	
}
