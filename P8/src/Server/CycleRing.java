
package Server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class CycleRing extends Thread{
    
    public ArrayList<String> dirs = new ArrayList<>();
    public String host;
    public int port;
    public ServerSocket ss;
    public Socket cl;
    public String localip;
    
    public CycleRing(String host, int port) throws FileNotFoundException, IOException{
        this.host = host;
        this.port = port;
        String cadena;
        FileReader f = new FileReader("ip.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            dirs.add(cadena);
        }
        b.close();
        
        //GET LOCAL IP
        try{
            DatagramSocket socket = new DatagramSocket();
            socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
            localip = socket.getLocalAddress().getHostAddress();
            socket.close();
        }catch(SocketException | UnknownHostException e){
            System.err.println("Error en ImplServerInterface >> constructor()");
        }
        
    }
    
    @Override
    public void run(){
        
        DataInputStream dis;
        DataOutputStream dos;
        
        try{
            ss = new ServerSocket(8889);
            System.out.println("Servicio CycleRing iniciado en el puerto: "+port);
           // while(true){
                /*cl = ss.accept();
                System.out.println("Cliente conectado desde: "+cl.getInetAddress());
                
                dis = new DataInputStream(cl.getInputStream());
                dos = new DataOutputStream(cl.getOutputStream());
                String z = dis.readUTF();
                System.out.println("Hola me llegó un poderosisisisisisisisisisismo y exquisto: "+z);
                */
                System.out.println("Here");
                String ipfinal = null;
                int a = dirs.lastIndexOf(localip);
                int b = 0;//dirs.lastIndexOf(z);
                int posicionsig = 0;
                
                if(a > b)
                    ipfinal = localip;
                //else
                  //  ipfinal = z;
                
                if(a == dirs.size())
                    posicionsig = 0;
                else
                    posicionsig = a++;
                
                SendNextRing s = new SendNextRing();
                s.setAddress(dirs.get(posicionsig), 8889, ipfinal);
                
                //dis.close();
                //dos.close();
                //cl.close();
            //}
        }catch(IOException e){
            System.err.println("Error en IsAlive");
       
        }
        
    }
}
