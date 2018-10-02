
package server;

import DB.jugadorDB;
import DB.tiradaDB;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecvServer implements RecvInterface {
	@Override
	public void dataRecv(String iduser, String ip, String user) throws RemoteException{
		try {
			jugadorDB jdb = new jugadorDB(iduser, ip, user);
			int i = jdb.registrarJugador();
			System.out.println("respuesta jugadorDB: "+i);
		} catch (SQLException ex) {
			System.out.println("ERROR AL REGISTRAR jugador DESDE RecvServer");
			ex.printStackTrace();
		}
	}
	@Override
	public void dataRecv(String hora, int idcart, String iduser) throws RemoteException{
		try {        
			tiradaDB tdb = new tiradaDB(hora, idcart ,iduser);
			tdb.registrarTirada();
		} catch (SQLException ex) {
			System.out.println("ERROR AL REGISTRAR tirada DESDE RecvServer");
			ex.printStackTrace();
		}
	}
	@Override
	public void  init(){
		try {
			java.rmi.registry.LocateRegistry.createRegistry(1099);  //puerto default del rmiregistry
			System.out.println("RMI registry ready.");
		} catch (Exception e) {
			System.out.println("Exception starting RMI registry:");
			e.printStackTrace();
		 }

		try {
			System.setProperty("java.rmi.server.codebase","http://8.25.100.18/clases/"); //file:///f:\\redes2\\RMI\\RMI2
			RecvServer obj = new RecvServer();
			RecvInterface stub = (RecvInterface) UnicastRemoteObject.exportObject(obj, 0);

			// Bind the remote object's stub in the registry
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("RecvInterface", stub);

			System.err.println("Servidor RMI listo...");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
	
}
