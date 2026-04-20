/**
 * Author: Archana Kumari
 * Date: 4/20/26
 * File: ThreadLocalDemoForId.java
 */

package thread.threadLocal;

import androidx.annotation.Nullable;

public class ThreadLocalDemoForId extends Thread {
    public ThreadLocalDemoForId(String threadName) {
        super(threadName);
    }

    static int userDefinedThreadId = 0;
    private static ThreadLocal threadLocal = new ThreadLocal() {
        @Nullable
        @Override
        protected Object initialValue() {
            return ++userDefinedThreadId;
        }
    };

    @Override
    public void run() {
        System.out.println("Thhread Name" + Thread.currentThread().getName() + " and userDefinedThreadId" + threadLocal.get());
    }
}
