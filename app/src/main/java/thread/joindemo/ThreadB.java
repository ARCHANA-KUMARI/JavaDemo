/**
 * Author: Archana Kumari
 * Date: 4/28/26
 * File: ThreadB.java
 */

package thread.joindemo;

public class ThreadB extends Thread {
    int mTotal = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            mTotal = mTotal + i;
        }
    }
}

