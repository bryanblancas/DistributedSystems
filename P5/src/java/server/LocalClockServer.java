
package server;
import SyncClock.Reloj;
import java.rmi.AlreadyBoundException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class LocalClockServer implements LocalClock{
	
	Reloj r;
	
	public LocalClockServer(){};
	
	@Override
	public void setLocalClock(int hrs, int min, int seg, int clock) throws RemoteException{
		r = new Reloj(hrs,min,seg,clock);r.start();
	}
	
	@Override
	public Reloj getReloj() throws RemoteException {
		return r;
	}
	
	@Override
	public void setClock(int hts, int min, int seg, int clock) throws RemoteException {
		r.setHrs(hts);
		r.setMin(min);
		r.setSeg(seg);
		r.setClock(clock);
	}

	
	@Override
	public  void init(int hrs, int min, int seg, int clock) throws RemoteException{
		try {
			java.rmi.registry.LocateRegistry.createRegistry(1099);  //puerto default del rmiregistry
			System.out.println("LocalClockServerRMI registry ready.");
		} catch (RemoteException e) {
			System.out.println("Exception starting LocalClockServerRMI registry:");
		 }

		try {
			System.setProperty("java.rmi.server.codebase","http://8.25.100.18/clases/"); //file:///f:\\redes2\\RMI\\RMI2
			LocalClockServer obj = new LocalClockServer();
			obj.setLocalClock(hrs,min,seg,clock);
			LocalClock stub = (LocalClock) UnicastRemoteObject.exportObject(obj, 0);

			// Bind the remote object's stub in the registry
			Registry registry = LocateRegistry.getRegistry();  
			registry.bind("LocalClock", stub);

			System.err.println("Servidor RMI listo...");
		} catch (AlreadyBoundException | RemoteException e) {
			System.err.println("Server exception: " + e.toString());
		}
	}	
}
