package singleton;

/**
 * This design pattern is used when
 * you want to build only one object
 * of a class
 */
public class Singleton {

    // Only instance of this class
    private static Singleton onlyInstance = null;

    // fields here:
    private int field1;
    private int field2;
    // end of fields.

    /**
     * You can make the constructor private
     * so there no one is allowed to build
     * more instances of this class.
     */
    private Singleton(
            // parameters if required
    ){
        // statements
    }

    // implement your methods here:
    public void method1(
            // parameters if required
    ){
        // statements
    }
    private void method2(
            // parameters if required
    ){
        // statements
    }
    // end of method implementation.

    // setters
    public void setField1(int field1) {
        this.field1 = field1;
    }
    public void setField2(int field2) {
        this.field2 = field2;
    }

    // getters
    public int getField1() {
        return field1;
    }
    public int getField2() {
        return field2;
    }

    /**
     * @return only instance of this class
     */
    public static Singleton getOnlyInstance(
            // parameters if required
    ) {
        if(onlyInstance == null)
            onlyInstance = new Singleton();
        // You can do other changes here
        // also use your input params to do so.
        return onlyInstance;
    }

}
