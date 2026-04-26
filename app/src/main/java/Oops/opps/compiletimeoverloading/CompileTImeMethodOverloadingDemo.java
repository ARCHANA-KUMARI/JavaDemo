/**
 * Author: Archana Kumari
 * Date: 4/26/26
 * File: CompileTImeMethodOverloadingDemo.java
 */

package Oops.opps.compiletimeoverloading;

public class CompileTImeMethodOverloadingDemo {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        // Compile-time method overloading resolution
        notifier.sendNotification("Hello Archana!"); // Text
        notifier.sendNotification("Job Update", "Your interview is scheduled for April 27th."); // Email
        notifier.sendNotification("Battery Low!", 1); // Push
    }

}
