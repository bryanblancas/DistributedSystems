package General;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class Client_RMI {
    String host;
    String name;
    Registry registry;
    ServerInterface si;
    
    public Client_RMI(String host, String name){
        this.host = host;
        this.name = name;
    }
    public void setConexion() throws RemoteException, NotBoundException{
        registry = LocateRegistry.getRegistry( host );
        si = (ServerInterface) registry.lookup( name ) ;
    }
    public int regJugador(String iduser, String ip, String user, int repetir) throws RemoteException{
        int i = si.registrarJugador(iduser, ip, user, repetir);
        return i;
    }
    public ArrayList<String> pedirCarta() throws RemoteException{
        ArrayList<String> i = si.pedirCarta();
        return i;
    }
    public int regTirada(String hora, int idcart, String iduser, int repetir) throws RemoteException{
        int i = si.registrarTirada(hora, idcart, iduser, repetir);
        return i;
    }
}
