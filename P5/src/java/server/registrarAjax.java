
package server;
import DB.jugadorDB;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registrarAjax")
public class registrarAjax extends  HttpServlet {
    private static final long serialVersionUID = 1L;
		
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					
		String id = request.getParameter("id");
		String user = request.getParameter("user");
		
		jugadorDB jdb;
		int i = 0;
		try {
			jdb = new jugadorDB(id, "192.168.0.1",user);
			i = jdb.registrarJugador();
		} catch (SQLException ex) {
			Logger.getLogger(registrarAjax.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		//ClientRMI crmi = new ClientRMI("localhost",id, "192.168.0.1", user);
		//crmi.registrarJugador();
			
		response.setContentType("text/plain");
		response.getWriter().write(id);

    }
    
}