package pcp_semaphores;

import java.util.concurrent.Semaphore;


 /**
 * PLAKOLB Marcel
 */
public class Threads extends Thread{
    String name;
    PCP problem;
    
    public Threads(String name, PCP prod) {
        super(name);
        this.name = name;
        this.problem = prod;
    }

    @Override
    public void run() {
        if(this.getName().equals("producer")) {
            try {
                problem.produce();
            } catch (InterruptedException ex) {
                System.out.println("Error " + ex.getMessage());
            }
        }
        else {
            try {
                problem.consume();
            } catch (InterruptedException ex) {
                System.out.println("Error " + ex.getMessage());}
            }
        }
    }