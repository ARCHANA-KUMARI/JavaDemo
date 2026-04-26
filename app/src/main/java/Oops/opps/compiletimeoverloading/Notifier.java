/**
 * Author: Archana Kumari
 * Date: 4/26/26
 * File: Notifier.java
 */

package Oops.opps.compiletimeoverloading;

public class Notifier {

    // Overloaded method for simple text notification
    public void sendNotification(String message) {
        System.out.println("Text Notification: " + message);
    }

    // Overloaded method for email notification
    public void sendNotification(String subject, String body) {
        System.out.println("Email -> Subject: " + subject + ", Body: " + body);
    }

    // If data type of parmas are same and changing the order of params it doesn`t work because during method call we will have to send actual data so compiler will not differentiate both methods.
/*    public void sendNotification(String body, String subject) {
        System.out.println("Email -> Subject: " + subject + ", Body: " + body);
    }*/

    // Overloaded method for push notification with priority
    public void sendNotification(String message, int priority) {
        System.out.println("Push Notification [Priority " + priority + "]: " + message);
    }

}
