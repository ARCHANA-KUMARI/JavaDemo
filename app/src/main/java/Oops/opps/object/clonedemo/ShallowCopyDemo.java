package Oops.opps.object.clonedemo;

/**
 * @Author: Archana Kumari
 * @Date: 15-04-2023
 */
public class ShallowCopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Hai hai = new Hai(10);
        Hello h1 = new Hello(20, hai);
        Hello h2 = (Hello) h1.clone();
        h1.show();
        h2.show();
        System.out.println(h1 == h2);
        System.out.println(h1.hai == h2.hai);
        h2.y = 30;
        h1.show();
        h2.show();
        h2.hai.x = 111;
        h1.show();
        h2.show();
    }
}
