/**
 * Author: Archana Kumari
 * Date: 3/5/2026
 */

package thread.basic;


public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        System.out.println("Main thread start" + ",Name:" + Thread.currentThread());

        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Thread is started running..." + ",Name:" + getName());
                System.out.println("Thread is started running" + ",Name:" + Thread.currentThread());
                try {
                    sleep(2000);
                    System.out.println("Thread in run block after sleep...getState:" + getState() + ",Name:" + getName() +  ",CurrentTIme:" + System.currentTimeMillis());
                    Thread.sleep(2000); // moves to TIMED_WAITING
                    System.out.println("Thread in run block after sleep...getState:" + getState()  + ",Name:" + getName()+ ",CurrentTIme:" + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException e:" + e);
                    e.printStackTrace();
                }
                System.out.println("Thread in run block after sleep...getState****:" + getState()  + ",Name:" + getName() + ",CurrentTIme:" + System.currentTimeMillis());
                System.out.println("Thread finished execution.");
            }
        };

        thread.setName("Worker Thread");
        // NEW state
        System.out.println("State after creation: " + thread.getState()   + ", Name:" + thread.getName()+ ",CurrentTIme:" + System.currentTimeMillis());
        // RUNNABLE state (after start)
        thread.start();
        System.out.println("State after calling start(): " + thread.getState() + ", Name:" + thread.getName() + ",CurrentTIme:" + System.currentTimeMillis());

        try {
            // Give thread time to enter sleep
            System.out.println("State before sleeping: " + thread.getState() + ",Name:" + thread.getName() + ",CurrentTIme:" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("State while sleeping: " + thread.getState() + ",Name:" + thread.getName() + ",CurrentTIme:" + System.currentTimeMillis());

            // Wait for thread to finish
             thread.join();
            System.out.println("State after completion: " + thread.getState() + ",Name:" + thread.getName() + ",CurrentTIme:" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread end," + ",Name:" + Thread.currentThread());
    }
}
