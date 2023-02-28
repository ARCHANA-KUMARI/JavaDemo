package designpattern.factory;

/**
 * @Author: Archana Kumari
 * @Date: 27-02-2023
 */
public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an email notification");
    }
}
