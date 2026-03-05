/**
 * Author: Archana Kumari
 * Date: 3/5/2026
 */

package thread.basic;

public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Thread is started running...");
                try {
                    Thread.sleep(2000); // moves to TIMED_WAITING
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException e:" + e);
                    e.printStackTrace();
                }
                System.out.println("Thread finished execution.");
            }
        };

        // NEW state
        System.out.println("State after creation: " + thread.getState());
        // RUNNABLE state (after start)
        thread.start();
        System.out.println("State after calling start(): " + thread.getState());

        try {
            // Give thread time to enter sleep
            Thread.sleep(500);
            System.out.println("State while sleeping: " + thread.getState());

            // Wait for thread to finish
            thread.join();
            System.out.println("State after completion: " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
