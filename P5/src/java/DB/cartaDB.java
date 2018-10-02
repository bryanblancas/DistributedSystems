
package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class cartaDB {
	private int idcarta;
	DBConnect dbc;
	Connection cx;
	Statement con;
	ResultSet rs;
	ArrayList a ;
	
	public cartaDB(int idcarta) throws SQLException{
		this.idcarta = idcarta;
		a = new ArrayList();
		dbc = new DBConnect();
		dbc.setConexion();
		cx = dbc.getConexion();
		con = dbc.getConsulta();
		rs = dbc.getResultSet();
	}
	
	public ArrayList<String> obtenerCarta(){
		try{
			con=cx.createStatement();
			rs=con.executeQuery("Select * from carta WHERE id='"+idcarta+"';");
			
			 while (rs.next()) {
				String id = Integer.toString(rs.getInt("id"));
				a.add(id);
				a.add(rs.getString("valor"));
				a.add(rs.getString("imagen"));
			 }
			 
			return a;
			
		 }catch(Exception e){
			 System.out.print("Unabled to get cart");
			System.out.println(e.toString());
			return null;
		 }
	}
}
