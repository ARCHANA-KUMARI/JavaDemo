package thread;

import android.util.Log;

/**
 * @Author: Archana Kumari
 * @Date: 02-02-2023
 */
public class SynchronizedCounter {
    private final static String TAG = "Archana";
    private int c = 0;

    public synchronized void increment() {
        for(int i = 0 ; i < 1000; i++) {
            System.out.println("increment: c before" + c);
            c++;
            System.out.println("increment: c after" + c);
        }
    }

    public synchronized void decrement() {
        for(int i = 0 ; i < 1000; i++) {
            System.out.println("decrement: c before dec" + c);
            c--;
            System.out.println("decrement: c after dec" + c);
        }
    }

    public  int value() {
        return c;
    }
}
