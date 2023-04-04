package thread;

/**
 * @Author: Archana Kumari
 * @Date: 02-02-2023
 */
public class SyncronizedDemoThread implements Runnable{
    public SyncronizedDemoThread(SynchronizedCounter mSyncronizedCount) {
        this.mSyncronizedCount = mSyncronizedCount;
    }
    private SynchronizedCounter mSyncronizedCount;

    @Override
    public void run() {
        if(mSyncronizedCount != null){
            System.out.println("SyncronizedDemoThread run:  start");
            mSyncronizedCount.increment();
            System.out.println("SyncronizedDemoThread run:  end");
        }
    }
}
