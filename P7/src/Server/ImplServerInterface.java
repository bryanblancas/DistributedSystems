
package Server;

import General.ServerInterface;
import DB.cartaDB;
import DB.jugadorDB;
import DB.tiradaDB;
import General.Client_RMI;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImplServerInterface implements ServerInterface{
    
    ArrayList<String> dirs = new ArrayList<>();
    
    public ImplServerInterface() throws FileNotFoundException, IOException{
        String cadena;
        FileReader f = new FileReader("ip.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            dirs.add(cadena);
        }
        b.close();
    }
    
    @Override
    public int registrarJugador(String iduser, String ip, String user, int repetir) throws RemoteException{
        int i = 0;
        try {
            jugadorDB jdb = new jugadorDB(iduser, ip, user);
            i = jdb.registrarJugador();
            System.out.println("Registre jugador "+iduser);           
        } catch (SQLException ex) {
            System.out.println("ERROR AL REGISTRAR jugador DESDE ImplServerInterface");
            ex.getMessage();
        }
        
        if(repetir == 1){
            for(int j=1; j<dirs.size(); j++){
                System.out.println("mandar a "+dirs.get(j));
//                Client_RMI crmi = new Client_RMI(dirs.get(j),"Server");
//                try {
//                    crmi.setConexion();
//                    crmi.regJugador(iduser, ip, user, 0);
//                } catch (NotBoundException ex) {
//                    Logger.getLogger(ImplServerInterface.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
        }
        
        return i;
    }
    
    @Override
    public ArrayList<String> pedirCarta() throws RemoteException{
        ArrayList <String> a = new ArrayList<String>();
        cartaDB cdb = null;
        try {
            cdb = new cartaDB((int) (Math.random() * 55) + 2);
        } catch (SQLException ex) {
            System.out.println("Error al pedir carta ImplServerInterface");
        }
        a = cdb.obtenerCarta();
        return a;
    }
    
    @Override
    public int registrarTirada(String hora, int idcart, String iduser, int repetir) throws RemoteException{
        int i = 0;
        try {      
            tiradaDB tdb = new tiradaDB(hora, idcart ,iduser);
            i = tdb.registrarTirada();
            System.out.println("Registré tirada "+hora+idcart+iduser);
         
        } catch (SQLException ex) {
            System.out.println("ERROR AL REGISTRAR tirada DESDE ImplServerInterface");
            ex.getMessage();
        }
        
        if(repetir == 1){
            for(int j=1; j<dirs.size(); j++){
                System.out.println("mandar a "+dirs.get(j));
//                Client_RMI crmi = new Client_RMI(dirs.get(j),"Server");
//                try {
//                    crmi.setConexion();
//                    crmi.regTirada(hora, idcart, iduser, 0);
//                } catch (NotBoundException ex) {
//                    Logger.getLogger(ImplServerInterface.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
        }
        
        return i;
    }
}
