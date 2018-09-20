
package Server.Back;

import General.Request;
import Server.UI.Coordinador;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class GetRequest {
	public static void main(String [] args){
		
		Coordinador c = new Coordinador();
		c.setVisible(true);
		
		int port = 8888;
		try {
			
			Socket cl;
			Request rqs;
			ServerSocket ss = new ServerSocket(port);
			System.out.println("Servidor iniciado");
			
			while(true){
				System.out.println("hol");
				cl=ss.accept();
				System.out.println("Cliente conectado desde:"+cl.getInetAddress());

				ObjectInputStream ois = new ObjectInputStream(cl.getInputStream());
				rqs = (Request) ois.readObject();
				
				ProcessingRequest pr = new ProcessingRequest(rqs, cl.getInetAddress().toString());
				ArrayList  status = pr.run(); //not a thread
				
				if(status!=null){
					ObjectOutputStream oos = new ObjectOutputStream(cl.getOutputStream());
					Request r = new Request(0,null,(String) status.get(1),cl.getInetAddress().toString());
					oos.writeObject(r);
					oos.flush();
					c.setImg((String) status.get(2));
					c.setUser(rqs.getIdUser()+":"+rqs.getName());
					c.setIp(cl.getInetAddress().toString());
					oos.close();
				}
				
				ois.close();
				cl.close();
			}
			
		}catch(Exception ioe){
			ioe.printStackTrace();
		}
		
	}
}
