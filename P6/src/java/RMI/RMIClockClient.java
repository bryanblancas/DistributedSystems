
package RMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClockClient {
    String host;
    String name;
    Registry registry;
    SyncClockInterface sci;
    public String iduser;
    public String ip;
    public String user;
    public String hora;
    public int idcart;
    
    public RMIClockClient(String host, String name){
        this.host = host;
        this.name = name;
    }
    public void setConexion() throws RemoteException, NotBoundException{
        registry = LocateRegistry.getRegistry( host );
        sci = (SyncClockInterface) registry.lookup( name ) ;
    }
    public void setReloj(int clock) throws RemoteException{
        sci.setClock(clock);
    }
    public int getReloj() throws RemoteException{
        return sci.getClock();
    }
    public void setDataRecv(String iduser, String ip, String user){
        this.iduser = iduser;
        this.ip = ip;
        this.user = user;
    }
    public void setDataRecv(String hora, int idcart, String iduser){
        this.iduser = iduser;
        this.hora = hora;
        this.idcart = idcart;
    }
    public void registrarJugador() throws RemoteException{
        sci.dataRecv(iduser, ip, user);
    }
    public void registrarTirada() throws RemoteException{
        sci.dataRecv(hora, idcart, iduser);
    }
}
