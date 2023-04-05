package thread.sleep;

/**
 * @Author: Archana Kumari
 * @Date: 05-04-2023
 */
public class SleepDriver {
    public static void main(String[] args) {
        new Thread(new SleepDemoThread()).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread i" + i);
        }
    }
}
