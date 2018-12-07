
package Server;

import Client.AskIsAlive;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AskStatus extends Thread {
    public String host;
    public int port;
    public Socket cl;
    
    public AskStatus(){
        this.host = "192.168.43.53";
        this.port = 8888;
    }
    
    public void setAddress(String host, int port){
        this.host = host;
        this.port = port;
    }
    @Override
    public void run(){
        DataInputStream dis;
        DataOutputStream dos;
        int a = 0;
        while(true){
            a = 0;
            try {
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(AskStatus.class.getName()).log(Level.SEVERE, null, ex);
            }
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
                try {
                    CycleRing c = new CycleRing("localhost", 8889);
                    c.start();
                } catch (IOException ex) {
                    Logger.getLogger(AskStatus.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        }
    }
    
}
