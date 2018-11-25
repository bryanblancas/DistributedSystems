
package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class AskIsAlive {
    public String host;
    public int port;
    public Socket cl;
    
    public AskIsAlive(){}
    
    public void setAddress(String host, int port){
        this.host = host;
        this.port = port;
    }
    
    public int send(){
        DataInputStream dis;
        DataOutputStream dos;
        int a = 0;
        
        try{
            SocketAddress sa = new InetSocketAddress(host, port);
            cl = new Socket();
            cl.connect(sa, 1000);

            dos = new DataOutputStream(cl.getOutputStream());
            dis = new DataInputStream(cl.getInputStream());
            
            dos.writeInt(a);
            dos.flush();
            
            a = dis.readInt();
            
            dos.close();
            dis.close();
            cl.close();
        }catch(IOException e){
            System.err.println("Error en AskIsAlive");
        }
        return a;
    }
}
