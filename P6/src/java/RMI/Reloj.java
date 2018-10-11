
package RMI;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Reloj extends Thread {
    int clock;
    
    public Reloj(int clock){
        this.clock = clock;
    }
    public void setReloj(int clock){
        this.clock = clock;
    }
    public int getReloj(){
        return clock;
    }
    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(1000);
                clock++;
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }
    }
}
