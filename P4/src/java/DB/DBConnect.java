
package DB;

import java.sql.*;

public class DBConnect {
	
	private Connection conexion;
	private Statement consulta;
	private ResultSet resulset;
  
	public DBConnect(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("Driver mysql found");
		} catch (Exception e) {
			System.out.println("Driver not found");
		}
	}
	
	public void cerrarConexion(){
		try{
			conexion.close();
		}catch(Exception e){
			System.out.println("Close DB conexion fail");
		}
	}   
	
	public void setConexion() throws SQLException{
		conexion=null;
		try{
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/p3_distribuidos","root","1234");
			consulta=conexion.createStatement();
			System.out.println("Conexion a p3_distribuidos exitosa");
		}catch(SQLException e){
			System.out.println("Unabled to connect to database");
			e.printStackTrace();
		}
	}
	
	public Connection getConexion(){
		return conexion;
	}
	public Statement getConsulta(){
		return consulta;
	}
	public ResultSet getResultSet(){
		return resulset;
	}
	
}
