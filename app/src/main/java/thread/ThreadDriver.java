package thread;

/**
 * @Author: Archana Kumari
 * @Date: 02-02-2023
 */
public class ThreadDriver {
    public static void main(String[] args) {
        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();

        SyncronizedDemoThread syncronizedDemoThread = new SyncronizedDemoThread(synchronizedCounter);
        Thread thIncreament = new Thread(syncronizedDemoThread);


        SyncronizedDemoDecThread syncronizedDemoDecThread = new SyncronizedDemoDecThread(synchronizedCounter);
        Thread thDecreament = new Thread(syncronizedDemoDecThread);

        ThreadCounterAccesser counterAccesser= new ThreadCounterAccesser(synchronizedCounter);
        Thread counter = new Thread(counterAccesser);
        thIncreament.start();
        counter.start();
        thDecreament.start();

    }
}
