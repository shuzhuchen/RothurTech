package week2.hw7.src;

// define a class named Singleton
public class Singleton {

    // private constructor to force use of getInstance() to create Singleton object
    private static Singleton obj;

    // private constructor to prevent instantiation from outside the class
    private Singleton() {}

    //  getInstance() is declared static, so it can be called without creating an object of the class. The first call to getInstance() creates the singleton object.
    public static Singleton getInstance() {

        // check whether the Singleton object has already been created, if not yet, create it.
        if (obj == null) {
            obj = new Singleton();
        }

        // return the singleton object
        return obj;
    }
}