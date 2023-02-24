package thread.syncronizedblock;

import androidx.annotation.NonNull;

/**
 * @Author: Archana Kumari
 * @Date: 15-02-2023
 */
public class IncrThread implements Runnable{
    @NonNull
    private MSLunch msLunch;

    public IncrThread(MSLunch msLunch) {
        this.msLunch = msLunch;
    }

    @Override
    public void run() {
        System.out.println("IncrThread thread started");
        msLunch.inc1();
       try {
           Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("IncrThread thread ended");
    }
}
