
package thread1;


import java.util.logging.Level;
import java.util.logging.Logger;

public class R implements Runnable{

    private char c;

    public R(char c) {
        this.c = c;
    }

    public void run() {
        try {
            while (true) {
                System.out.println("Ciao sono Thread, implemento Runnable " + this.c);
                Thread.sleep(2000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(T.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
