
package Server;

import Client.AskIsAlive;
import General.ServerInterface;
import DB.cartaDB;
import DB.jugadorDB;
import DB.tiradaDB;
import General.Client_RMI;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ImplServerInterface implements ServerInterface{
    
    ArrayList<String> dirs = new ArrayList<>();
    static String localip;
    public ImplServerInterface() throws FileNotFoundException, IOException{
        String cadena;
        FileReader f = new FileReader("ip.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            dirs.add(cadena);
        }
        b.close();
        
        //GET LOCAL IP
        try{
            DatagramSocket socket = new DatagramSocket();
            socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
            localip = socket.getLocalAddress().getHostAddress();
            socket.close();
        }catch(SocketException | UnknownHostException e){
            System.err.println("Error en ImplServerInterface >> constructor()");
        }
    }
    
    public static int isValid(String dir){
    
        if(dir.equals(localip))
            return 0;
        
        AskIsAlive ask = new AskIsAlive();
        ask.setAddress(dir, 8888);
        return ask.send();
        
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
            for(String dir: dirs){
                
                int a = isValid(dir);
                if(a == 1){
                    System.out.println("La ip "+dir+" es válida, se mandará la petición");
                    Client_RMI crmi = new Client_RMI(dir,"Server");
                    try {
                        crmi.setConexion();
                        crmi.regJugador(iduser, ip, user, 0);
                    } catch (NotBoundException ex) {
                        System.err.println("Error en ImplServerInterface >> registrarJugador");
                    }
                }
                else
                    System.out.println("La ip "+dir+ " es la misma que la local o no está disponible");
                 
            }
        }
        
        return i;
    }
    
    @Override
    public ArrayList<String> pedirCarta() throws RemoteException{
        ArrayList <String> a = new ArrayList<>();
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
            for(String dir: dirs){
                
                int a = isValid(dir);
                if(a == 1){
                    System.out.println("La ip "+dir+" es válida, se mandará la petición");
                    Client_RMI crmi = new Client_RMI(dir,"Server");
                    try {
                        crmi.setConexion();
                        crmi.regTirada(hora, idcart, iduser, 0);
                    } catch (NotBoundException ex) {
                        System.err.println("Error en ImplServerInterface >> registratTirada()");
                    }
                }
                else
                    System.out.println("La ip "+dir+ " es la misma que la local o no está disponible");
                 
            }
        }
        
        return i;
    }
}
