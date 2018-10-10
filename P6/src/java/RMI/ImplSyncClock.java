package RMI;

import DB.jugadorDB;
import DB.tiradaDB;
import java.rmi.RemoteException;
import java.sql.SQLException;

public class ImplSyncClock implements SyncClockInterface{
    Reloj r;
    public ImplSyncClock(int clock_start){
        r = new Reloj(clock_start);
        r.start();
    }
    @Override
    public void dataRecv(String iduser, String ip, String user) throws RemoteException{
        try {
            jugadorDB jdb = new jugadorDB(iduser, ip, user);
            int i = jdb.registrarJugador();
            System.out.println("respuesta jugadorDB: "+i);
        } catch (SQLException ex) {
            System.out.println("ERROR AL REGISTRAR jugador DESDE RecvServer");
            ex.getMessage();
        }
    }
    @Override
    public void dataRecv(String hora, int idcart, String iduser) throws RemoteException{
        try {        
            String hora_local = Integer.toString(r.getReloj());
            tiradaDB tdb = new tiradaDB(hora_local, idcart ,iduser);
            tdb.registrarTirada();
        } catch (SQLException ex) {
            System.out.println("ERROR AL REGISTRAR tirada DESDE RecvServer");
            ex.getMessage();
        }
    }
    @Override
    public int getClock() throws RemoteException {
        return r.getReloj();
    }

    @Override
    public void setClock(int clock) throws RemoteException {
        if(r.getReloj()<clock)
            r.setReloj(++clock);
    }
    
}
