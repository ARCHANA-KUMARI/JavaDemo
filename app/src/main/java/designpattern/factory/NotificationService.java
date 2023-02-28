package designpattern.factory;

/**
 * @Author: Archana Kumari
 * @Date: 27-02-2023
 */
public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

    }
}
