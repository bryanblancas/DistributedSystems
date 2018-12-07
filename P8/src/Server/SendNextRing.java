package Server;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class SendNextRing {
    public String host;
    public int port;
    public String dir;
    public Socket cl;
    
    public SendNextRing(){}
    
    public void setAddress(String host, int port, String dir){
        this.host = host;
        this.port = port;
        this.dir = dir;
    }
    
    public int send(){
        DataInputStream dis;
        DataOutputStream dos;
        int a = 0;
        
        try{
            /*SocketAddress sa = new InetSocketAddress(host, port);
            cl = new Socket();
            cl.connect(sa, 1000);*/
            Socket cl = new Socket(host, port);
            
            dos = new DataOutputStream(cl.getOutputStream());
            dis = new DataInputStream(cl.getInputStream());
            
            dos.writeUTF(dir);
            dos.flush();
            
            dos.close();
            dis.close();
            cl.close();
        }catch(IOException e){
            System.err.println("Error en AskIsAlive");
        }
        return a;
    }
}
