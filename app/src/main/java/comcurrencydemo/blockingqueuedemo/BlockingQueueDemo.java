package comcurrencydemo.blockingqueuedemo;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: Archana Kumari
 * @Date: 31-03-2023
 */
public class BlockingQueueDemo {
    public static void main(String args[]) {
        // Input from user for limit
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of item limit to produce item:");
        int limit = scanner.nextInt();
        scanner.close();

        BlockingQueue blockingQueue = new LinkedBlockingQueue();
        new Thread(new Producer(blockingQueue, limit)).start();
        new Thread(new Consumer(blockingQueue)).start();
        new Thread(new Consumer(blockingQueue)).start();
        new Thread(new Consumer(blockingQueue)).start();
    }
}
