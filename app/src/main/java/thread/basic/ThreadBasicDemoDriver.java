/**
 * Author: Shweta Kumari
 * Date: 3/5/2026
 */

package thread.basic;

public class ThreadBasicDemoDriver {
    public static void main(String[] args) {
       ThreadByExtend threadByExtend = new ThreadByExtend();
       threadByExtend.run();

       //O/P using directly calling run method
       // ThreadByExtend constructor call:Thread[#1,main,5,main], Thread`S Name:Thread-0
       // ThreThreadByExtend run:Thread[#1,main,5,main], Thread`S Name:Thread-0

      // threadByExtend.start();
       // O/P
       // ThreadByExtend constructor call:Thread[#1,main,5,main], Thread`S Name:Thread-0
      //  ThreThreadByExtend run:Thread[#22,Thread-0,5,main], Thread`S Name:Thread-0

        /*   ThreadByImplRunnable threadByImplRunnable = new ThreadByImplRunnable();
        Thread th = new Thread(threadByImplRunnable);
        th.start();*/
    }
}
