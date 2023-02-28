package thread.waitnotify;

/**
 * @Author: Archana Kumari
 * @Date: 25-02-2023
 */
public class EvenOddPrintThreadDriver {
    public static void main(String[] args) {
        EvenOddGenerator evenOddGenerator = new EvenOddGenerator();
        new Thread(new ThreadOdd(10, evenOddGenerator)).start();
        new Thread(new ThreadEven(10, evenOddGenerator)).start();
    }
}
