package thread.executerocumbuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: Archana Kumari
 * @Date: 29-03-2023
 */
public class ExecuterServiceDriver {
    public static void main(String args[]) {
       // ExecutorService executorService = Executors.newFixedThreadPool(10); // more than one thread so parallel exeecution of task
        ExecutorService executorService = Executors.newFixedThreadPool(1); // sequential  execution of task because only one thread in Thread pool
        /*executorService.execute(ExecuterDemoRunnable("Task1"));
        executorService.execute(ExecuterDemoRunnable("Task2"));
        executorService.execute(ExecuterDemoRunnable("Task3"));*/
        //or
        executorService.execute(ExecuterDemoRunnable("Task3"));
        executorService.execute(ExecuterDemoRunnable("Task1"));
        executorService.execute(ExecuterDemoRunnable("Task2"));

        executorService.shutdown();

    }

    public static Runnable ExecuterDemoRunnable(String taskName) {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Current Thread with task name:" + Thread.currentThread().getName() + ":" + taskName);
            }
        };
    }
}
