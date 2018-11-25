
package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class IsAlive extends Thread{
    
    public String host;
    public int port;
    public ServerSocket ss;
    public Socket cl;
    
    public IsAlive(String host, int port){
        this.host = host;
        this.port = port;
    }
    
    @Override
    public void run(){
        
        DataInputStream dis;
        DataOutputStream dos;
        
        try{
            ss = new ServerSocket(port);
            System.out.println("Servicio IsAlive iniciado en el puerto: "+port);
            while(true){
                int a = 0;
                cl = ss.accept();
                System.out.println("Cliente conectado desde: "+cl.getInetAddress());
                
                dis = new DataInputStream(cl.getInputStream());
                dos = new DataOutputStream(cl.getOutputStream());
                a = dis.readInt();
                System.out.println(a);
                
                a = 1;
                dos.writeInt(a);
                dos.flush();
                
                dis.close();
                dos.close();
                cl.close();
            }
        }catch(IOException e){
            System.err.println("Error en IsAlive");
        }
        
    }
}
