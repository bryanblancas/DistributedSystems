
package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerRequest {
	public static void main(String [] args){
		
		try{	
			ServerSocket s= new ServerSocket(1234);	
			System.out.println("Sevidor iniciado... Esperando Clientes de consulta sql");

			while(true){
				
				Socket cl=s.accept();		
				System.out.println("\nCliente conectado desde"+cl.getInetAddress()+":"+cl.getPort());
				BufferedReader br1 = new BufferedReader(new InputStreamReader(cl.getInputStream()));
				
				String msj = br1.readLine();
				System.out.println("------------ ME HA LLEGADO: "+msj);
				
				System.out.println("Cliente desconectado");
				br1.close();
				cl.close();

			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(1);
		}
		
	}
}
