package thread.sleep;

/**
 * @Author: Archana Kumari
 * @Date: 05-04-2023
 */
public class SleepDemoThread implements Runnable {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + " Started executing..");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Sleep time in ms" + (System.currentTimeMillis() - start));
        System.out.println(Thread.currentThread().getName() + "Ended executing..");
    }
}

