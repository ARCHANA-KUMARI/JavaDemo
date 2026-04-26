/**
 * Author: Archana Kumari
 * Date: 4/26/26
 * File: CompileTImeMethodOverloadingByDiffReturnType.java
 * Description: Compile Time method overloading can`t happen using different return type.
 * O/p: Compilation fail with msg "'sendNotification(String)' clashes with 'sendNotification(String)'; both methods are duplicate"
 */

package Oops.opps.compiletimeoverloading;

public class CompileTImeMethodOverloadingByDiffReturnType {
    // Commented for compilation purpose, uncomment it to see it`s behaviour.
  /*  public void sendNotification(String message) {
        System.out.println("Text Notification: " + message);
    }
*/
    public String sendNotification(String message) {
        System.out.println("Text Notification: " + message);
        return message;
    }


}
