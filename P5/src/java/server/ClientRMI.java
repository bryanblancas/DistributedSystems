
package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI {
	public String host;
	public String iduser;
	public String ip;
	public String user;
	public String hora;
	public int idcart;
    
     public ClientRMI(String host, String iduser, String ip, String user) {
		this.host = host;
		this.iduser = iduser;
		this.ip = ip;
		this.user = user;
	}
	public ClientRMI(String host, String hora, int idcart, String iduser) {
		this.host = host;
		this.iduser = iduser;
		this.hora = hora;
		this.idcart = idcart;
    }
		 
	public void registrarJugador() {
     
		try {
			System.out.println("------------"+host);

			Registry registry = LocateRegistry.getRegistry(host);	

			RecvInterface stub = (RecvInterface) registry.lookup("RecvInterface");

			stub.dataRecv(iduser,ip, user);
			
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
	
	public void registrarTirada() {
     
		try {
			System.out.println("------------"+host);

			Registry registry = LocateRegistry.getRegistry(host);	

			RecvInterface stub = (RecvInterface) registry.lookup("RecvInterface");

			stub.dataRecv(hora,idcart, iduser);
			
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
    }
}
