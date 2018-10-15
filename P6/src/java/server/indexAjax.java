
package server;

import DB.cartaDB;
import DB.tiradaDB;
import RMI.RMIClockClient;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
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
        /*Calendar calendario = Calendar.getInstance();
        int hrs_act =calendario.get(Calendar.HOUR_OF_DAY);
        int min_act = calendario.get(Calendar.MINUTE);
        int seg_act = calendario.get(Calendar.SECOND);

        String hora = hrs_act+":"+min_act+":"+seg_act;*/
        String id = request.getParameter("id");

        cartaDB cdb = null;
        try {
            cdb = new cartaDB((int) (Math.random() * 55) + 2);
        } catch (SQLException ex) {
            Logger.getLogger(indexAjax.class.getName()).log(Level.SEVERE, null, ex);
        }
        a = cdb.obtenerCarta();
        
        
        RMIClockClient al = new RMIClockClient("localhost", "ServerSyncClock");
        RMIClockClient al2 = new RMIClockClient("8.12.0.112", "ServerSyncClock");
        try {
            al.setConexion();
            al2.setConexion();
        } catch (RemoteException | NotBoundException ex) {
            System.out.println("indexajax no se pudo conectar a server syncclock");
        }
        int idcart =Integer.parseInt( a.get(0));
        int hora_local = al.getReloj();
        al2.setReloj(hora_local);
        String hora = Integer.toString(hora_local);
        
        al2.setDataRecv(hora, idcart, id);
        al2.registrarTirada();
        
        try {        
            tiradaDB tdb = new tiradaDB(hora, idcart,id);
            tdb.registrarTirada();
        } catch (SQLException ex) {
            Logger.getLogger(indexAjax.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(h<=50){
            response.setContentType("text/plain");
            response.getWriter().write("<img src='imagenes/"+a.get(1)+"'>"+h);
        }
        else{
            h=0;
            response.setContentType("text/plain");
            response.getWriter().write("popo");
        }
    }
    
}