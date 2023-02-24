package thread.syncronizedblock;

import android.util.Log;

import androidx.annotation.NonNull;

/**
 * @Author: Archana Kumari
 * @Date: 15-02-2023
 */
public class DecrThread implements Runnable {
    @NonNull
    private MSLunch msLunch;

    public DecrThread(MSLunch msLunch) {
        this.msLunch = msLunch;
    }

    @Override
    public void run() {
        System.out.println("DecrThread started");
        msLunch.inc2();
        System.out.println("DecrThread ended");
    }
}
