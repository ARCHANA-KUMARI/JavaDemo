package thread.joindemo;

/**
 * @Author: Archana Kumari
 * @Date: 05-04-2023
 */
public class JoinDemoDriver {
    public static void main(String[] args){
        MyThread.mainThread = Thread.currentThread();
        Thread childThread = new Thread(new MyThread());
        childThread.start(); // Main Thread is waiting to complete child thread
        /*try {
            childThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        for(int i = 0; i <10; i++){
            System.out.println("Main Thread Started");
        }
    }
}
