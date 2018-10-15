
package server;
import DB.jugadorDB;
import RMI.RMIClockClient;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
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
        
        RMIClockClient al = new RMIClockClient("localhost", "ServerSyncClock");
        RMIClockClient al2 = new RMIClockClient("8.12.0.112", "ServerSyncClock");
        try {
            al.setConexion();
            al2.setConexion();
        } catch (RemoteException | NotBoundException ex) {
            System.out.println("registrarajax no se pudo conectar a server syncclock");
        }
        int hora_local = al.getReloj();
        al2.setReloj(hora_local);
        al2.setDataRecv(id, "192.168.0.1", user);
        al2.registrarJugador();

        response.setContentType("text/plain");
        response.getWriter().write(id);

    }
    
}