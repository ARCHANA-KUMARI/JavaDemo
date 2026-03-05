/**
 * Author: Shweta Kumari
 * Date: 3/5/2026
 */

package thread.basic;

public class ThreadBasicDemoDriver {
    public static void main(String[] args) {
//        ThreadByExtend threadByExtend = new ThreadByExtend();
//        threadByExtend.start();
        ThreadByImplRunnable threadByImplRunnable = new ThreadByImplRunnable();
        Thread th = new Thread(threadByImplRunnable);
        th.start();
    }
}
