
package RMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class pruebasRMI {
    public static void main(String [] args){
        System.out.println("HOLA");
        RMIClockClient a = new RMIClockClient("8.12.0.133", "ServerSyncClock");
        try {
            a.setConexion();
        } catch (RemoteException | NotBoundException ex) {
            System.out.println("PRUEBASRMI no se pudo conectar a server syncclock");
        }
        try{
            System.out.println(a.getReloj());
            a.setReloj(200);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(pruebasRMI.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(a.getReloj());
        }catch(RemoteException re){
            System.out.println("Error al procesar clock" +re.getMessage());
        }
    }
}
