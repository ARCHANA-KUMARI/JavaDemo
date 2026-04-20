/**
 * Author: Archana Kumari
 * Date: 4/20/26
 * File: ThreadLocalDemoForId.java
 */

package thread.threadLocal;

import androidx.annotation.NonNull;

public class ThreadLocalDemoForId extends Thread {
    public ThreadLocalDemoForId(String threadName) {
        super(threadName);
    }

     static int userDefinedThreadId = 0;
    static  private  ThreadLocal threadLocal = new ThreadLocal() {
        @NonNull
        @Override
        protected Object initialValue() {
            return ++userDefinedThreadId;
        }
    };

    @Override
    public void run() {
        System.out.println("Thread Name" + Thread.currentThread().getName() + " and userDefinedThreadId" + threadLocal.get() + " , And threadLocal object : " + threadLocal);
    }
}
