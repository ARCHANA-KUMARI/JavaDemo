package thread.threadLocal;

/**
 * @Author: Archana Kumari
 * @Date: 04-04-2023
 */
public class ThreadLocalDemo {
    public static void main(String[] args) {
        // Main thread uses of ThreadLocal Api
        ThreadLocal threadLocal = new ThreadLocal();
        System.out.println("Get default value for main thread: " + threadLocal.get()); //o/p null
        threadLocal.set("Test for set api");
        System.out.println("ThreadLocalDemo.main" + threadLocal.get());
        threadLocal.remove();
        System.out.println("get threadLocal variable value after threadLocal.remove()= " + threadLocal.get());

        ThreadLocalDemoForId threadLocalDemoForId1 = new ThreadLocalDemoForId("Thread 1.");
        ThreadLocalDemoForId threadLocalDemoForId2 = new ThreadLocalDemoForId("Thread 2.");
        ThreadLocalDemoForId threadLocalDemoForId3 = new ThreadLocalDemoForId("Thread 3.");
        ThreadLocalDemoForId threadLocalDemoForId4 = new ThreadLocalDemoForId("Thread 4.");

        threadLocalDemoForId1.start();
        threadLocalDemoForId2.start();
        threadLocalDemoForId3.start();
        threadLocalDemoForId4.start();

    }
}
