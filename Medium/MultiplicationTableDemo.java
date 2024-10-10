import java.util.Scanner;

class MultiplicationTable extends Thread {
    private int number;

    // Constructor to set the number for the multiplication table
    public MultiplicationTable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            // Simulate thread sleeping to show lifecycle states
            System.out.println("Thread for " + number + " started.");
            Thread.sleep(100); // Simulate work (Thread is in Sleeping state)

            // Display multiplication table
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " X " + i + " = " + (number * i));
                Thread.sleep(50); // Simulate time taken for processing
            }
            System.out.println("Thread for " + number + " finished.");
        } catch (InterruptedException e) {
            System.out.println("Thread for " + number + " interrupted.");
        }
    }
}

public class MultiplicationTableDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Sample input for multiplication tables
        int[] numbers = {5, 10}; // This can be changed to test other values

        // Create and start threads for each number
        for (int number : numbers) {
            MultiplicationTable tableThread = new MultiplicationTable(number);
            tableThread.start(); // Thread is in Runnable state
        }

        // Example test cases
        int[][] testCases = {
            {10, 20},
            {-10, -30},
            {0, 0},
            {6, 6},  // Adjusted from "SIX, SIX" to integers
            {9, 9}   // Adjusted from "9.8, 9.6" to integers
        };

        // Process test cases
        System.out.println("\nTest Cases:");
        for (int[] testCase : testCases) {
            for (int number : testCase) {
                MultiplicationTable tableThread = new MultiplicationTable(number);
                tableThread.start();
                try {
                    tableThread.join(); // Wait for the thread to finish
                } catch (InterruptedException e) {
                    System.out.println("Main thread interrupted.");
                }
            }
        }

        scanner.close();
    }
}
