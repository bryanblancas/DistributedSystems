
package RMI;

import java.rmi.*;

public interface SyncClockInterface extends Remote {
    public int getClock() throws RemoteException;
    public void setClock(int clock) throws RemoteException;
    public void dataRecv(String iduser, String ip, String user) throws RemoteException;
    public void dataRecv(String hora, int idcart, String iduser) throws RemoteException;
}
