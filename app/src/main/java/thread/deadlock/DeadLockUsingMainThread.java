/**
 * Author: Archana Kumari
 * Date: 3/9/2026
 */

package thread.deadlock;

public class DeadLockUsingMainThread {
    public static void main(String[] args) {
        try {
            System.out.println("Entering to deadlock");
            Thread.currentThread().join();
            System.out.println("This statement will never execute..");
        } catch (InterruptedException e) {
            System.out.println("Compile time ext:" + e);
            throw new RuntimeException(e);
        }
    }
}
