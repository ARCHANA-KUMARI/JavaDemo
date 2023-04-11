package thread.interrupt;

/**
 * @Author: Archana Kumari
 * @Date: 05-04-2023
 */
public class InterruptThreadDriver {
    public static void main(String[] args){
        System.out.println("Main Thread started");
        Thread thread = new Thread(new InterruptThreadDemo());
        thread.start();
        thread.interrupt();
    }
}
