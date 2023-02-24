package thread;

import android.util.Log;

/**
 * @Author: Archana Kumari
 * @Date: 02-02-2023
 */
public class SyncronizedDemoDecThread implements Runnable{
    private static String TAG = "Archana";
    private SynchronizedCounter mSyncronizedCount;

    public SyncronizedDemoDecThread(SynchronizedCounter mSyncronizedCount) {
        this.mSyncronizedCount = mSyncronizedCount;
    }

    @Override
    public void run() {
    if(mSyncronizedCount != null){
        System.out.println("SyncronizedDemoDecThread run:  start");
        mSyncronizedCount.decrement();
        System.out.println("SyncronizedDemoDecThread run:  end");
    }
    }
}
