
package Client.UI;

import Client.Back.Reloj;

public class Launcher extends Thread{
	
	UI uic;
	public Launcher(UI uic){
		this.uic = uic;
	}
	
	@Override
	public void run(){
		Reloj r = new Reloj(10,10,10,1000);
		r.start();
		
		while(true){
			try{
				uic.setHora(r.getHrs(),r.getMin(),r.getSeg());
			}catch(NullPointerException npe){}	
		}
			
	}
}
