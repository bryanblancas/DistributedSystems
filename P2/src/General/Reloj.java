package General;

import java.io.Serializable;

public class Reloj extends Thread implements Serializable {
	public int hrs;
	public int min;
	public int seg;
	public int clock;
	
	public Reloj(int hrs, int min, int seg, int clock){
		this.hrs = hrs;
		this.min = min;
		this.seg = seg;
		this.clock = clock;
	}
	
	public void setHrs(int hrs){
		this.hrs = hrs;
	}
	public void setMin(int min){
		this.min = min;
	}
	public void setSeg(int seg){
		this.seg = seg;
	}
	
	public int getHrs(){
		return hrs;
	}
	public int getMin(){
		return min;
	}
	public int getSeg(){
		return seg;
	}
	
	@Override
	public void run(){
		while(true){
			//DEJAR PASAR UN SEGUNDO
			try{Thread.currentThread().sleep(clock);	}catch(InterruptedException e){}
			
			//Algoritmos de 24 hrs 60 min 60 seg
			seg ++;
			if(seg == 60){
				seg = 0;
				min++;
			}
			if(min == 60){
					min = 0;
					hrs ++;
					
			}
			else if(min < 0){
				min = 60+min;
				hrs--;
			}
			if(hrs == 24){
				hrs = 0;
			}
		}
	}
	
}
