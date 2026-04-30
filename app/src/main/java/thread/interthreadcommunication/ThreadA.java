/**
 * Author: Archana Kumari
 * Date: 4/30/26
 * File: ThreadA.java
 */

package thread.interthreadcommunication;


public class ThreadA {
    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();
        synchronized (threadB) {
            System.out.println("threadB is trying to call wait method= " + threadB.getState());
            threadB.wait();
            System.out.println("threadB.mTotal = " + threadB.mTotal);
        }
    }
}
