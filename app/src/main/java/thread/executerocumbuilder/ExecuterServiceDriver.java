package thread.executerocumbuilder;

import android.os.StrictMode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Archana Kumari
 * @Date: 29-03-2023
 */
public class ExecuterServiceDriver {
    public static void main(String args[]) {
       // ExecutorService executorService = Executors.newFixedThreadPool(10); // more than one thread so parallel exeecution of task
       // ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(1); // sequential  execution of task because only one thread in Thread pool
        executorService.execute(ExecuterDemoRunnable("Task1"));
        executorService.execute(ExecuterDemoRunnable("Task2"));
        executorService.execute(ExecuterDemoRunnable("Task3"));

        //Shut down demo
        List<Runnable> runnableList = executorService.shutdownNow(); // returns unexecuted task list
        System.out.println("runnableList.size:" + runnableList.size());
        for (Runnable runnable : runnableList) {
            System.out.println("Runnable: after shutdown" + runnable);
        }

        try {
            System.out.println("Await Termination status:" + executorService.awaitTermination(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
           e.printStackTrace();
        }


        //or
     /*   executorService.execute(ExecuterDemoRunnable("Task3"));
        executorService.execute(ExecuterDemoRunnable("Task1"));
        executorService.execute(ExecuterDemoRunnable("Task2"));
        executorService.shutdown();*/

      /*  // Get result and block main thread with runnable
        Future future = executorService.submit(ExecuterDemoRunnable("Task1"));
        System.out.println("Is it done before:" + future.isDone());
        System.out.println("Cancel checked: before task is completed:" + future.cancel(true)); // true
        try {
            future.get();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            e.printStackTrace();
        }
         executorService.shutdown()
        System.out.println("Is is done after:" + future.isDone());
        System.out.println("Cancel checked: when task is completed:" + future.cancel(true)); // false*/

/*
        // Get result and block main thread with Callable
        Future future = executorService.submit(ExecuterDemoCallable("Task1 using callable"));
        try {
            System.out.println("Returned value after computation using callable: " + future.get());
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         executorService.shutdown()
*/

       /* // Multiple callabale with anyone task execution

        List<Callable<String>> callableList = new ArrayList<>();
        callableList.add(ExecuterDemoCallable("Task1"));
        callableList.add(ExecuterDemoCallable("Task2"));
        callableList.add(ExecuterDemoCallable("Task3"));
        try {
           // String result = executorService.invokeAny(callableList);
            //System.out.println("Returned value after computation using callable: " + result);
            List<Future<String>> futureList = executorService.invokeAll(callableList);
            //List<Runnable> runnableList =  executorService.shutdownNow();
            for (Future<String> taskName: futureList) {
                System.out.println("Returned value after computation using callable: " + taskName.get());
            }
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       executorService.shutdown();
*/

    }

    public static Callable<String> ExecuterDemoCallable(String taskName) {
        return new Callable() {
            @Override
            public String call() throws Exception {
                System.out.println("I am in onCall");
                return Thread.currentThread().getName() + ":" + taskName;
            }
        };
    }

    public static Runnable ExecuterDemoRunnable(String taskName) {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable current instance to check shutdownNow:" + this);
                System.out.println("Current Thread with task name:" + Thread.currentThread().getName() + ":" + taskName);
                //wait(10000);
            }
        };
    }
}
