package factory;

/**
 * This is an interface used as return type for
 * factory method. remember for more flexibility
 * (like using protected instead of public) you
 * can use normal or abstract class as its parent.
 */
public interface Notification {

    // IMPLEMENTING DIFFERENT METHODS TO NOTIFY
    void notifyUser();

}
