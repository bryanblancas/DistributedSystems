
package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class tiradaDB {
	private String time;
	private int idcarta;
	private String idjugador;
	DBConnect dbc;
	Connection cx;
	Statement con;
	ResultSet rs;
	
	public tiradaDB(String time, int idcarta, String idjugador) throws SQLException{
		this.idjugador = idjugador;
		this.idcarta = idcarta;
		this.time = time;
		dbc = new DBConnect();
		dbc.setConexion();
		cx = dbc.getConexion();
		con = dbc.getConsulta();
		rs = dbc.getResultSet();
	}
	
	public int registrarTirada() throws SQLException{
		
		try{
			String sql_query="INSERT INTO tirada(hora,carta_id,jugador_idjugador) value(?,?,?)";
			PreparedStatement statement=cx.prepareStatement(sql_query);

			statement.setString(1,time);
			statement.setInt(2,idcarta);
			statement.setString(3,idjugador);

			statement.executeUpdate();
			statement.close();
			
			return 1;
		}catch(Exception e){
			System.out.println("Unabled to insert throw: "+e.toString());
			return -1;
		}
		
	}
}
