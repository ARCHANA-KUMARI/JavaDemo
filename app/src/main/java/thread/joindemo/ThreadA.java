/**
 * Author: Archana Kumari
 * Date: 4/28/26
 * File: ThreadA.java
 */

package thread.joindemo;

public class ThreadA {
    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();
        threadB.join(); // ThreadA waits to die threadB
        System.out.println("threadB.mTotal = " + threadB.mTotal);
    }

}
