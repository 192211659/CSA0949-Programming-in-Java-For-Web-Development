// Class for addition operation
class Addition extends Thread {
    private int a, b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        int result = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + result);
    }
}

// Class for subtraction operation
class Subtraction extends Thread {
    private int a, b;

    public Subtraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        int result = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + result);
    }
}

// Class for multiplication operation
class Multiplication extends Thread {
    private int a, b;

    public Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        int result = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + result);
    }
}

// Class for division operation
class Division extends Thread {
    private int a, b;

    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        if (b != 0) {
            double result = (double) a / b;
            System.out.println("Division: " + a + " / " + b + " = " + result);
        } else {
            System.out.println("Division: Cannot divide " + a + " by zero.");
        }
    }
}

// Main class to execute the calculator operations
public class MultiThreadedCalculator {
    public static void main(String[] args) {
        // Create threads for different operations
        Addition addition = new Addition(10, 5);
        Subtraction subtraction = new Subtraction(10, 5);
        Multiplication multiplication = new Multiplication(10, 5);
        Division division = new Division(10, 5);

        // Start the threads
        addition.start();
        subtraction.start();
        multiplication.start();
        division.start();

        // Wait for all threads to finish
        try {
            addition.join();
            subtraction.join();
            multiplication.join();
            division.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All calculations are done.");
    }
}
