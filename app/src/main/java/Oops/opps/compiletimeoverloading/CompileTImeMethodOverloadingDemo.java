/**
 * Author: Archana Kumari
 * Date: 4/26/26
 * File: CompileTImeMethodOverloadingDemo.java
 */

package Oops.opps.compiletimeoverloading;

public class CompileTImeMethodOverloadingDemo {
    public static void main(String[] args) {
/*        Notifier notifier = new Notifier();
        // Compile-time method overloading resolution
        notifier.sendNotification("Hello Archana!"); // Text
        notifier.sendNotification("Job Update", "Your interview is scheduled for April 27th."); // Email
        notifier.sendNotification("Battery Low!", 1); // Push
        notifier.sendNotification(1,"Battery Low!"); // Push changed order of params if data type is different it`s working fine.*/

        CompileTimeMethodOverloadingIfNotExactPrototype obj = new CompileTimeMethodOverloadingIfNotExactPrototype();
        obj.show((byte) 25);
        obj.show("hello");
        obj.show(250);
        obj.show('A');
    }

}
