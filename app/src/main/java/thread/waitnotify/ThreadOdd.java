package thread.waitnotify;

/**
 * @Author: Archana Kumari
 * @Date: 25-02-2023
 */
public class ThreadOdd implements Runnable {
    private int mTerms;

    public ThreadOdd(int mTerms, EvenOddGenerator mEvenOddGenerator) {
        this.mTerms = mTerms;
        this.mEvenOddGenerator = mEvenOddGenerator;
    }

    private EvenOddGenerator mEvenOddGenerator;

    @Override
    public void run() {
        try {
            mEvenOddGenerator.printOdd(mTerms);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception in OddThread" + mTerms);
        }
    }
}
