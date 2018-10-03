
package server;

import SyncClock.Reloj;
import java.rmi.*;

public interface LocalClock extends Remote {
	public void setLocalClock(int hrs, int min, int seg, int clock) throws RemoteException;
	public Reloj getReloj() throws RemoteException; 
	public void setClock(int hts, int min, int seg,  int clock) throws RemoteException;
	public void init(int hrs, int min, int seg, int clock) throws RemoteException;
}
