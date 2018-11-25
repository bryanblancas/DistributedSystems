package Server;

import General.ServerInterface;
import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class StartServer extends UnicastRemoteObject{
    public StartServer()throws RemoteException{super();}
    
    public static void main(String [] args) throws AlreadyBoundException, IOException{   
        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            
            System.setProperty("java.rmi.server.hostname", "8.12.0.109");
            
            ImplServerInterface s = new ImplServerInterface();
            ServerInterface stub = (ServerInterface) UnicastRemoteObject.exportObject(s, 0);
            LocateRegistry.getRegistry().bind( "Server" , stub ) ;
            
            System.out.println("Servidor RMI iniciado...");
        } catch (RemoteException e) {
            System.out.println("Exception starting RMI ServerSyncClock");
            e.getMessage();
        }

    }
    
}
