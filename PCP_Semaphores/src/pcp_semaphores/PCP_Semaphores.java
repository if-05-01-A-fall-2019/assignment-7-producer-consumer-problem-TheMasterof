package pcp_semaphores;

import java.util.concurrent.Semaphore;

/**
 *PLAKOLB Marcel
 */
public class PCP_Semaphores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(1);
        System.out.println("Starting");
        PCP problem = new PCP(semaphore); 
        Threads thread1 = new Threads("producer", problem);
        Threads thread2 = new Threads("consumer", problem);
        thread2.start();
        thread1.start();
        thread1.join();
        thread2.join();
    }
    
}