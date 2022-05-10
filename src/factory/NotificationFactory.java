package factory;

/**
 * This is what we call an example for factory method!
 */
public class NotificationFactory {

    /**
     * You can have different implementation
     * for factory method.
     * plus you can build notification factory as you
     * seem fit to be static or not.
     * @param channel this is an exemplary parameters
     * @return Notification of your wanted type
     */
    public static Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }

    /**
     * for example, you can define another factory methods
     * which builds your default instance!
     * @return PushNotification
     */
    public static Notification createNotification(
            // No parameters
    ){
        return new PushNotification();
    }

}
