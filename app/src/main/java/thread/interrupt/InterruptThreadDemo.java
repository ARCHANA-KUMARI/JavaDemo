package thread.interrupt;

/**
 * @Author: Archana Kumari
 * @Date: 05-04-2023
 */
public class InterruptThreadDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("InterruptThreadDemo thread start");
        for (int i = 0; i < 1000; i++) {
            System.out.println("InterruptThreadDemo thread start : i" + i);
            if(Thread.currentThread().isInterrupted()){
               System.out.println("Inturrpted on i" + i);
               return;
            }
        }
    }
}
