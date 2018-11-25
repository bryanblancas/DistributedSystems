
package General;

import java.rmi.*;
import java.util.ArrayList;

public interface ServerInterface extends Remote {
    public int registrarJugador(String iduser, String ip, String user, int repetir) throws RemoteException;
    public ArrayList<String> pedirCarta() throws RemoteException;
    public int registrarTirada(String hora, int idcart, String iduser, int repetir) throws RemoteException;
}
