package thread.syncronizedblock;

/**
 * @Author: Archana Kumari
 * @Date: 15-02-2023
 */
public class MSLunch {
    private long c1 = 0;
    private long c2 = 0;

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void inc1() {
        System.out.println("Inc1 method started");
        synchronized (/*this*/lock1/*MSLunch.class*/) {
            System.out.println("Inc1 block started" + MSLunch.class);
            System.out.println("Inc1" + this);
            System.out.println("Before Incr1 " + c1);
            c1++;
            System.out.println("After Incr1 " + c1);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Inc1 block ended");
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Inc1 method ended");
    }

    public void inc2() {
        System.out.println("Inc2 method started");
        synchronized (/*this*/lock2/*MSLunch.class*/) {
            System.out.println("Inc2 block started" + MSLunch.class);
            System.out.println("Inc2" + this);
            System.out.println("Before Incr2 " + c2);
            c2++;
            System.out.println("After Incr2 " + c2);
            System.out.println("Inc2 block ended");
        }
        System.out.println("Inc2 method end");
    }
}
