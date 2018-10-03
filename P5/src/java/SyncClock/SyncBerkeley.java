
package SyncClock;

import server.LocalClockClientRMI;

public class SyncBerkeley {
	public static int max(int a, int b){
		if (a>=b)
			return a;
		return b;
	}
	public static void main(String args []) throws InterruptedException{
		int hrs, min, seg, hrs1, min1, seg1, hrs2, min2, seg2;
			
		
		int latencia1 = 1000;
		int latencia2 = 1000;
		int holgura = 10;
		int f = holgura/max(latencia1,latencia2);	
		
		//reloj maestro
		Reloj r = new Reloj(0, 0, 0, 1000);
		r.start();
		
		//para el reloj 1: poner ip correspondiente
		LocalClockClientRMI lc1 = new LocalClockClientRMI("localhost");
		
		//para el reloj 2: poner la ip correspondiente
		//LocalClockClientRMI lc2 = new LocalClockClientRMI("ipcorrespondiente");
		
		while(true){
			Reloj r1 = lc1.getLocalClock();
			//Reloj r2 = lc2.getLocalClock();
			
			hrs = r.getHrs();
			min = r.getMin();
			seg = r.getSeg();
			
			hrs1 = r1.getHrs();
			min1 = r1.getMin();
			seg1 = r1.getSeg();
			
			//hrs2 = r2.getHrs();
			//min2 = r2.getMin();
			//seg2 = r2.getSeg();
			
			int promhrs = (hrs+hrs1)/2;
			
			lc1.setReloj(promhrs, min, seg, 1000);
			r.setHrs(promhrs);r.setMin(min);r.setSeg(seg);
			
			System.out.println("Corrección lanzada");
			
			Thread.currentThread().sleep(10000);
		}
		
	}
}
