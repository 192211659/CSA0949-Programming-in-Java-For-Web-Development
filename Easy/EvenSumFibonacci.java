public class EvenSumFibonacci {
    public static void main(String[] args) {
        int n = 4; // Change this value for different inputs
        // Validate input
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }
        int sum = 0;
        int a = 0, b = 1;
        // Generate Fibonacci series and calculate the sum at even indexes
        for (int i = 0; i <= n * 2; i++) { // Generate up to the N-th Fibonacci number
            if (i % 2 == 0) {
                sum += a; // Add Fibonacci number at even index
            }
            int next = a + b; // Calculate the next Fibonacci number
            a = b; // Move to the next term
            b = next; // Update the second term
        }
        // Print the result
        System.out.println("Sum of Fibonacci numbers at even indexes: " + sum);
    }
}
