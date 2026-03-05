/**
 * Author: Shweta Kumari
 * Date: 3/5/2026
 */

package thread.basic;

import androidx.annotation.NonNull;

public class ThreadByImplRunnable implements  Runnable{
    public ThreadByImplRunnable() {
        System.out.println("ThreadByImplRunnable constructor");
    }

    @Override
    public void run() {
        System.out.println("ThreadByImplRunnable run");
    }

    @NonNull
    @Override
    public String toString() {
        String res =  super.toString();
        System.out.println("toString res : " + res);
        return res;
    }
}
