class Singleton {
    // Private static variable to hold the single instance
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
        // Private constructor
    }

    // Public static method to provide access to the instance
    public static Singleton getInstance() throws Exception {
        if (instance == null) {
            instance = new Singleton(); // Create instance if it doesn't exist
        } else {
            throw new Exception("Cannot create another instance of Singleton.");
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // First attempt to create an instance
            Singleton singleton1 = Singleton.getInstance();
            System.out.println("Singleton instance created: " + singleton1);

            // Second attempt to create another instance
            Singleton singleton2 = Singleton.getInstance(); // This should throw an exception
            System.out.println("Singleton instance created: " + singleton2);
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Print the error message
        }
    }
}
