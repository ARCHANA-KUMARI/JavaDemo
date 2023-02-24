package thread;

/**
 * @Author: Archana Kumari
 * @Date: 02-02-2023
 */
public class ThreadCounterAccesser implements Runnable {
    public ThreadCounterAccesser(SynchronizedCounter mSyncronizedCount) {
        this.mSyncronizedCount = mSyncronizedCount;
    }
    private SynchronizedCounter mSyncronizedCount;

    @Override
    public void run() {
        System.out.println("ThreadCounterAccesser run:  start");
        System.out.println("ThreadCounterAccesser c value" + mSyncronizedCount.value());
        System.out.println("ThreadCounterAccesser run:  End");
    }
}
