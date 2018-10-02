
package server;

import java.rmi.*;

public interface RecvInterface extends Remote {
	public void dataRecv(String iduser, String ip, String user) throws RemoteException;
	public void dataRecv(String hora, int idcart, String iduser) throws RemoteException;
	public void init() throws RemoteException;
}
