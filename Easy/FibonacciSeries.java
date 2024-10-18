public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 6; // You can change this value for different outputs
        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        // Print the Fibonacci series
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + "\t"); // Print the current term
            int next = a + b; // Calculate the next term
            a = b; // Move to the next term
            b = next; // Update the second term
        }
    }
}
