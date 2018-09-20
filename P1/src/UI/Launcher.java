
package UI;

import BackEnd.Reloj;
import java.util.Calendar;

public class Launcher {
	public static void main(String Args[]){
		
		int hrs_act, min_act, seg_act;
		
		Main m = new Main();
		m.setVisible(true);
		
		Calendar calendario = Calendar.getInstance();
		hrs_act =calendario.get(Calendar.HOUR_OF_DAY);
		min_act = calendario.get(Calendar.MINUTE);
		seg_act = calendario.get(Calendar.SECOND);
		
		Reloj r1 = new Reloj(hrs_act,min_act,seg_act,1000);
		r1.start();
		Reloj r2 = new Reloj(20,45,32,500);
		r2.start();
		Reloj r3 = new Reloj(0,0,0,1000);
		r3.start();
		Reloj r4 = new Reloj(57,23,0,1000);
		r4.start();
		
		while(true){
			
			//Checar si se debe de modificar el reloj. Es un if else para evitar multiples actulizaciones y mantener consistencia 
			if (m.mod_r1){
				r1.setHrs(m.hrs_mod_r1);
				r1.setMin(m.min_mod_r1);
			}
			else if (m.mod_r2){
				r2.setHrs(m.hrs_mod_r2);
				r2.setMin(m.min_mod_r2);
			}
			else if (m.mod_r3){
				r3.setHrs(m.hrs_mod_r3);
				r3.setMin(m.min_mod_r3);
			}
			else if (m.mod_r4){
				r4.setHrs(m.hrs_mod_r4);
				r4.setMin(m.min_mod_r4);
			}
			
			//Mandar a imprimir hora del reloj 1
			m.setHrsR1(r1.getHrs());
			m.setMinR1(r1.getMin());
			m.setSegR1(r1.getSeg());
			// Mandar a imprimir hora del reloj 2
			m.setHrsR2(r2.getHrs());
			m.setMinR2(r2.getMin());
			m.setSegR2(r2.getSeg());
			// Mandar a imprimir hora del reloj 3
			m.setHrsR3(r3.getHrs());
			m.setMinR3(r3.getMin());
			m.setSegR3(r3.getSeg());
			// Mandar a imprimir hora del reloj 4
			m.setHrsR4(r4.getHrs());
			m.setMinR4(r4.getMin());
			m.setSegR4(r4.getSeg());
			
			
		}
		
	}
}
