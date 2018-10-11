
package RMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class StartRMIClockServer extends UnicastRemoteObject{
    public StartRMIClockServer()throws RemoteException{super();}
    
    public static void main(String [] args) throws AlreadyBoundException{   
        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            
            System.setProperty("java.rmi.server.hostname", "localhost");
            
            ImplSyncClock clk_sync = new ImplSyncClock(0); 
            SyncClockInterface stub = (SyncClockInterface) UnicastRemoteObject.exportObject(clk_sync, 0);
            LocateRegistry.getRegistry().bind( "ServerSyncClock" , stub ) ;
            
            System.out.println("Servidor RMI iniciado...");
        } catch (RemoteException e) {
            System.out.println("Exception starting RMI ServerSyncClock");
            e.getMessage();
        }

    }
    
}
