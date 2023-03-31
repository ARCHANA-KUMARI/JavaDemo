package comcurrencydemo.blockingqueuedemo;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

/**
 * @Author: Archana Kumari
 * @Date: 31-03-2023
 */
public class Producer implements Runnable {
    private BlockingQueue<String> mQueue;
    private static int LIMIT;

    public Producer(BlockingQueue<String> mQueue, int limit) {
        this.mQueue = mQueue;
        LIMIT = limit;
    }

    @Override
    public void run() {
        System.out.println("Producer Run:");
        for (int i = 0; i < LIMIT; i++) {
            try {
                mQueue.put("Data" + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
