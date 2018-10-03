
package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import SyncClock.*;

public class LocalClockClientRMI {
	String host;
	
	public LocalClockClientRMI(String host) {
		this.host = host;
	}
	
	public Reloj getLocalClock(){
		try {
			System.out.println("------------"+host);

			Registry registry = LocateRegistry.getRegistry("localhost");	

			LocalClock stub = (LocalClock) registry.lookup("LocalClock");

			Reloj r = stub.getReloj();
			
			return r;
			
		} catch (Exception e) {
			System.err.println("Client exception LocalClockClientRMI.getLocalClock: " + e.toString());
			e.printStackTrace();
			return null;
		}
	}
	
	public void setReloj(int hrs, int min, int seg, int clock){
		try {
			System.out.println("------------"+host);

			Registry registry = LocateRegistry.getRegistry(host);	

			LocalClock stub = (LocalClock) registry.lookup("LocalClock");

			 stub.setClock(hrs, min, seg, clock);
			
		} catch (Exception e) {
			System.err.println("Client exception in LocalClockClientRMI.setReloj: " + e.toString());
			e.printStackTrace();
		}
	}
	
}
