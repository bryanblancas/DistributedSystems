
package Cliente.UI;

import Cliente.BackEnd.Client_Socket;
import General.Reloj;

public class Launcher {
	public static void main(String []args){
		
		int pto = 8890;
		
		Reloj r;
		
		ui_cliente uic = new ui_cliente();
		uic.setVisible(true);
		
		Client_Socket cl = new Client_Socket(pto);
		cl.start();
		
		while(true){
			try{
				r = cl.r;
				uic.setHora(r.getHrs(),r.getMin(),r.getSeg());
			}catch(NullPointerException npe){}	
		}
		
	}
}
