
package Client.Back;

import Client.UI.UI;
import General.Request;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SendRequest extends Thread{
	private int port;
	private Request rqs;
	private	String dir;
	private Socket cl;
	UI uic;
	
	public SendRequest(int port, String dir, UI uic, Request rqs){
		this.port = port;
		this.dir = dir;
		this.uic = uic;
		this.rqs = rqs; 
	}
	
	@Override
	public void run(){
		try{	

			cl=new Socket(dir,port);
			ObjectOutputStream oos = new ObjectOutputStream(cl.getOutputStream());
			ObjectInputStream ois;
			oos.writeObject(rqs);
			oos.flush();
			
			if(rqs.getType()==2){	
				ois = new ObjectInputStream(cl.getInputStream());
				Request rqs2 = (Request) ois.readObject();
				uic.setInfo(rqs2.getName());
				ois.close();
			}
				
			oos.close();
			cl.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
