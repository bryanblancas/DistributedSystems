
package Servidor.BackEnd;

import General.Reloj;
import java.io.ObjectOutputStream;
import java.net.Socket;

//En realidad esta clase es un cliente
public class Server_socket extends Thread {
	int pto;
	String dir;
	Socket cl;
	Reloj r;
	ObjectOutputStream oos;
	 
	public Server_socket(int pto, String dir, Reloj r){
		this.pto = pto;
		this.dir = dir;
		this.r = r;
	}
	
	@Override
	public void run(){
		try{
			Socket cl = new Socket(dir,pto);
			ObjectOutputStream oos = new ObjectOutputStream(cl.getOutputStream());
			oos.writeObject(r);
			oos.flush();
			oos.close();
			cl.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
