/**
 * Author: Archana Kumari
 * Date: 3/5/2026
 */

package thread.basic;

public class ThreadByExtend extends  Thread{

    public ThreadByExtend() {
        System.out.println("ThreadByExtend constructor call:" + Thread.currentThread() + ", Thread`S Name:" + getName());

    }

    @Override
    public void run() {
        System.out.println("ThreThreadByExtend run:" + Thread.currentThread() + ", Thread`S Name:" + getName());
    }
}
