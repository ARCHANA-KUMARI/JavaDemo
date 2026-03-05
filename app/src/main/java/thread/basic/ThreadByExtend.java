/**
 * Author: Archana Kumari
 * Date: 3/5/2026
 */

package thread.basic;

public class ThreadByExtend extends  Thread{

    public ThreadByExtend() {
        System.out.println("ThreadByExtend constructor call");

    }

    @Override
    public void run() {
        System.out.println("ThreThreadByExtend run");
    }
}
