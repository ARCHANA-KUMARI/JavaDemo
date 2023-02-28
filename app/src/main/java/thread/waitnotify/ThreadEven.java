package thread.waitnotify;

/**
 * @Author: Archana Kumari
 * @Date: 25-02-2023
 */
public class ThreadEven implements Runnable {
    private int mTerms;
    private EvenOddGenerator mEvenOddGenerator;

    public ThreadEven(int mTerms, EvenOddGenerator mEvenOddGenerator) {
        this.mTerms = mTerms;
        this.mEvenOddGenerator = mEvenOddGenerator;
    }

    @Override
    public void run() {
        try {
            mEvenOddGenerator.printEven(mTerms);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception in OddThread" + mTerms);
        }
    }
}
