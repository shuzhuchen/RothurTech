package week2.hw7.src;

// defines an enum named Singleton
public enum Singleton {
    
    // creates the only object of the Singleton enum
    INSTANCE; 

    // defines a normal method inside the enum.
    public void doSomething() {

        // prints a message to the console
        System.out.println("Singleton instance is doing something.");
    }
}