/**
 * Author: Archana Kumari
 * Date: 11/5/26
 * File: WaitNotifyDriver.java
 */

package thread.waitnotify1;

import java.lang.Thread;
import java.lang.System;


public class WaitNotifyDriver {
    public static void main(String[] args) {
        Calculator cl = new Calculator(10);
        Thread1 th1 = new Thread1(cl);
        Thread t1 = new Thread(th1);
        t1.start();
        Thread2 th2 = new Thread2(cl);
        Thread t2 = new Thread(th2);
        t2.start();
    }

}

class Calculator {
     int term;
     int count = 1;

    Calculator(int term) {
        this.term = term;
    }

    public synchronized void printOdd() {
        while (count <= term) {
            if (count % 2 != 0) {
                System.out.println(count);
                try {
                    wait();
                } catch (InterruptedException e) {
                    // Restore the interrupted status so higher-level frameworks know it was cancelled
                    Thread.currentThread().interrupt();
                    // Handle the interruption here if necessary (e.g., clean up or exit)
                    System.out.println("Thread was interrupted.");
                }
            }
            count++;
            notify();

        }
    }

    public synchronized void printEven() {
        while (count <= term) {
            if (count % 2 == 0) {
                System.out.println(count);
                try {
                    wait();
                } catch (InterruptedException e) {
                    // Restore the interrupted status so higher-level frameworks know it was cancelled
                    Thread.currentThread().interrupt();
                    // Handle the interruption here if necessary (e.g., clean up or exit)
                    System.out.println("Thread was interrupted.");
                }
            }
            count++;
            notify();
        }
    }

}

class Thread1 implements Runnable {
    Calculator cal;

    Thread1(Calculator cal) {
        this.cal = cal;
    }

    @Override
    public void run() {
        cal.printOdd();
    }
}

class Thread2 implements Runnable {
    Calculator cal;

    Thread2(Calculator cal) {
        this.cal = cal;
    }

    @Override
    public void run() {
        cal.printEven();
    }
}
