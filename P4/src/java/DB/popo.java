/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFileChooser;

public class popo {
	public static void main(String [] args) throws SQLException{
		DBConnect dbc = new DBConnect();
		dbc.setConexion();
		Connection cx = dbc.getConexion();
		Statement con = dbc.getConsulta();
		ResultSet rs = dbc.getResultSet();
		
		/*JFileChooser jf = new JFileChooser();
		jf.requestFocus();
		jf.setMultiSelectionEnabled(true);
		jf.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int r = jf.showOpenDialog(null);
		File f[];
		if(r == JFileChooser.APPROVE_OPTION){

			f = jf.getSelectedFiles();
			for(File j : f){
				try{
					String sql_query="INSERT INTO carta(valor,imagen,tipos_id) value(?,?,?)";
					PreparedStatement statement=cx.prepareStatement(sql_query);

					statement.setString(1,j.getName());
					statement.setString(2,j.getCanonicalPath());
					statement.setInt(3,1);

					statement.executeUpdate();
					statement.close();

				}catch(Exception e){
					System.out.println(e.toString());
				}
			}
			
		}
		*/
		
		cartaDB  c= new cartaDB(4);
		ArrayList a = c.obtenerCarta();
		System.out.println(a.get(0)+":"+a.get(1)+":"+a.get(2));
		
	}
}
