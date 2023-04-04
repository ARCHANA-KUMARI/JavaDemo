package thread.joindemo;

/**
 * @Author: Archana Kumari
 * @Date: 05-04-2023
 */
public class MyThread implements Runnable {
    static Thread mainThread;

    @Override
    public void run() {
        try {
            mainThread.join(); // Child thread waiting to complete main thread
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}
