package factory;

// test
public class Main {
    public static void main(String[] args) {
        Notification sample = NotificationFactory.createNotification();
        Notification sms = NotificationFactory.createNotification("SMS");
        Notification email = NotificationFactory.createNotification("EMAIL");
        sample.notifyUser();
        sms.notifyUser();
        email.notifyUser();
    }
}
