package comcurrencydemo.blockingqueuedemo;

import java.util.concurrent.BlockingQueue;

/**
 * @Author: Archana Kumari
 * @Date: 31-03-2023
 */
public class Consumer implements Runnable {
    public Consumer(BlockingQueue<String> mQueue) {
        this.mQueue = mQueue;
    }

    private BlockingQueue<String> mQueue;

    @Override
    public void run() {
        if (mQueue != null && mQueue.size() > 0) {
            for (String str : mQueue) {
                System.out.println("Consumed:" + str);
            }
        } else {
            String error = mQueue == null ? "Queue is not initialized" : "Queue is empty nothing is to consume";
            System.out.println(error);
        }
    }
}
