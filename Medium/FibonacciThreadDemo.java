import java.util.Scanner;

class FibonacciSeries implements Runnable {
    private int terms;

    // Constructor to initialize the number of terms
    public FibonacciSeries(int terms) {
        this.terms = terms;
    }

    @Override
    public void run() {
        // Generate Fibonacci series
        generateFibonacci(terms);
    }

    // Method to generate Fibonacci series
    private void generateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("No terms to display.");
            return;
        }

        // Starting values for Fibonacci series
        int a = 0, b = 1;

        System.out.print("Fibonacci series for " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(a + " ");
                continue;
            }
            if (i == 1) {
                System.out.print(b + " ");
                continue;
            }
            int next = a + b; // Calculate next term
            System.out.print(next + " ");
            a = b; // Update a
            b = next; // Update b
        }
        System.out.println(); // New line after the series
    }
}

public class FibonacciThreadDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample inputs for test cases
        int[] testCases = {5, 7, -10, 0, 12}; // Adjusted invalid cases to valid integers

        // Process test cases
        System.out.println("Test Cases:");
        for (int terms : testCases) {
            // Create and start a thread for each test case
            Thread fibonacciThread = new Thread(new FibonacciSeries(terms));
            fibonacciThread.start();
            try {
                fibonacciThread.join(); // Wait for the thread to finish
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }

        scanner.close();
    }
}
