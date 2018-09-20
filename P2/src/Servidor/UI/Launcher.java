
package Servidor.UI;

import General.Reloj;
import java.util.Calendar;

public class Launcher { 
	public static void main(String [] args){
		
		int hrs = 10;
		int min = 10;
		int seg = 10;
		int clock = 1000;
		
		Calendar calendario = Calendar.getInstance();
		hrs =calendario.get(Calendar.HOUR_OF_DAY);
		min = calendario.get(Calendar.MINUTE);
		seg = calendario.get(Calendar.SECOND);
		
		Main m = new Main();
		m.setVisible(true);
		
		Reloj maestro = new Reloj(hrs,min,seg,clock);
		maestro.start();
		Reloj principal = new Reloj(hrs,min,seg,clock);
		principal.start();
		Reloj secundario1 = new Reloj(hrs+1,min,seg,clock);
		secundario1.start();
		Reloj secundario2 = new Reloj(hrs-1,min-30,seg,clock);
		secundario2.start();
	
		while(true){
			
			//Checar si se debe de modificar el reloj. Es un if else para evitar multiples actulizaciones y mantener consistencia 
			if (m.mod_maestro){
				maestro.setHrs(m.mod_hrs);
				maestro.setMin(m.mod_min);	
				principal.setHrs(m.mod_hrs);
				principal.setMin(m.mod_min);	
				secundario1.setHrs(m.mod_hrs+1);
				secundario1.setMin(m.mod_min);	
				secundario2.setHrs(m.mod_hrs-1);
				secundario2.setMin(m.mod_min-30);	
			}
			
			//Mandar a imprimir hora del reloj maestro
			m.setHora(maestro.getHrs(),maestro.getMin(),maestro.getSeg());
			//Mandar a imprimir hora del reloj principal
			m.setHoraPrincipal(principal.getHrs(),principal.getMin(),principal.getSeg());
			//Mandar a imprimir hora del reloj secundario 1
			m.setHoraSecu1(secundario1.getHrs(),secundario1.getMin(),secundario1.getSeg());
			//Mandar a imprimir hora del reloj secundario 2
			m.setHoraSecu2(secundario2.getHrs(),secundario2.getMin(),secundario2.getSeg());
			
		}
		
	}
}
