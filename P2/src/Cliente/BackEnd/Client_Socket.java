
package Cliente.BackEnd;

//en realidad es un serversocket

import General.Reloj;
import Cliente.UI.ui_cliente;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client_Socket extends Thread {
	
	private int pto;
	private ServerSocket s;
	private Socket cl;
	public Reloj r;
	
	public Client_Socket(int pto){
		this.pto = pto;
		r = null;
	}
	
	@Override
	public  void run(){
				
		try{
			ServerSocket s = new ServerSocket(pto);
			System.out.println("Servicio Client_Socket Iniciado en el puerto "+pto);
			
			while(true){
				
				Socket cl=s.accept();
				System.out.println("Cliente conectado desde:"+cl.getInetAddress());

				ObjectInputStream ois = new ObjectInputStream(cl.getInputStream());
				 r = (Reloj) ois.readObject();
				 r.start();
				
				System.out.println(r.getHrs()+":"+r.getMin()+":"+r.getSeg());
				
				ois.close();
				cl.close();
			}
		}catch(IOException | ClassNotFoundException e){e.printStackTrace();}
		
	}
}
