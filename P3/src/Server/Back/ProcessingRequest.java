 
package Server.Back;
import DB.cartaDB;
import DB.jugadorDB;
import DB.tiradaDB;
import General.Request;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProcessingRequest{
	private Request rqs;
	private String ip;
	
	public ProcessingRequest(Request rqs,String ip){
		this.rqs = rqs;
		this.ip = ip;
	}
	
	public ArrayList<String> run() throws SQLException{
		if(rqs.getType()==1){
			jugadorDB jdb = new jugadorDB(rqs.getIdUser(),ip,rqs.getName());
			jdb.registrarJugador();
			return null;
		}
		else{
			cartaDB  c= new cartaDB((int) (Math.random() * 55) + 2);
			ArrayList a = c.obtenerCarta();
			//System.out.println(a.get(0)+":"+a.get(1)+":"+a.get(2));
			String idcart = (String) a.get(0);
			tiradaDB tdb = new tiradaDB(rqs.getName(), Integer.parseInt(idcart),rqs.getIdUser());
			tdb.registrarTirada();
			return a;
		}
	}
	
}
