
package server;

import SyncClock.Reloj;
import java.rmi.RemoteException;

public class InitLocalClockServer {
	
	public static void main(String args[]) throws RemoteException{
		LocalClockServer lc = new LocalClockServer();
		lc.init(10,10,10,1000);
	}
}
