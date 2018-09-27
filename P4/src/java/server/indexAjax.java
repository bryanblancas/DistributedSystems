
package server;

import DB.cartaDB;
import DB.tiradaDB;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/indexAjax")
public class indexAjax extends  HttpServlet {
    private static final long serialVersionUID = 1L;

		int h =0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					
			h++;
		ArrayList <String> a = new ArrayList<String>();
		Calendar calendario = Calendar.getInstance();
		int hrs_act =calendario.get(Calendar.HOUR_OF_DAY);
		int min_act = calendario.get(Calendar.MINUTE);
		int seg_act = calendario.get(Calendar.SECOND);
		String hora = Integer.toString(hrs_act)+":"+Integer.toString(min_act)+":"+Integer.toString(seg_act);
		String id = request.getParameter("id");
		
		try {	
			cartaDB cdb = new cartaDB((int) (Math.random() * 55) + 2);
			a = cdb.obtenerCarta();
		} catch (SQLException ex) {
			Logger.getLogger(indexAjax.class.getName()).log(Level.SEVERE, null, ex);
		}
		String idcart = (String) a.get(0);
		try {        
			tiradaDB tdb = new tiradaDB(hora, Integer.parseInt(idcart),id);
			tdb.registrarTirada();
		} catch (SQLException ex) {
			Logger.getLogger(indexAjax.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		if(h<=50){
			response.setContentType("text/plain");
			response.getWriter().write("<img src='"+a.get(1)+"'>"+h);
		}
		else{
			h=0;
			response.setContentType("text/plain");
			response.getWriter().write("popo");
		}
    }
    
}