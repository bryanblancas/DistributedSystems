
package server;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SendRequest {
	public int port;
	public String dir;
	public String msj;
	
	public SendRequest(int port, String dir, String msj){
		this.port = port;
		this.dir = dir;
		this.msj = msj;
	}
	
	public void send(){
		try{	

			Socket cl=new Socket(dir,port);
			PrintWriter pw= new PrintWriter(new OutputStreamWriter(cl.getOutputStream()));
		
			pw.println(msj); 
			pw.flush(); 
			
			cl.close();
			pw.close();

		}catch(Exception e){
			System.out.println("Error al enviar request");
		}
	}
	
}
