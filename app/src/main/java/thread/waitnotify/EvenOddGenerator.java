package thread.waitnotify;

/**
 * @Author: Archana Kumari
 * @Date: 25-02-2023
 */
public class EvenOddGenerator {
    private static int mCount = 1;

    public void printOdd(int nTerms) throws InterruptedException {
        synchronized (this) {
            while (mCount < nTerms) {
                if (mCount % 2 == 0) {
                    System.out.println("Inside if block : printOdd mCount" + mCount);
                    wait();
                }
                System.out.println("After if block : printOdd");
                System.out.println(mCount);
                mCount++;
                notify();
            }
        }
    }

    public void printEven(int nTerms) throws InterruptedException {
        synchronized (this) {
            while (mCount < nTerms) {
                if (mCount % 2 == 1) {
                    System.out.println("Inside if block : printEven mCount" + mCount);
                    wait();
                }
                System.out.println("After if block : printEven");
                System.out.println(mCount);
                mCount++;
                notify();
            }
        }
    }
}
