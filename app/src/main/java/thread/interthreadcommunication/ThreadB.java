/**
 * Author: Archana Kumari
 * Date: 4/30/26
 * File: ThreadB.java
 */

package thread.interthreadcommunication;


public class ThreadB extends Thread {
    int mTotal = 0;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Child Thread starts calculations****");
            for (int i = 0; i <= 100; i++) {
                mTotal = mTotal + i;
            }
            System.out.println("Child Thread trying to give notification********** = ");
            this.notify();
        }
    }
}
