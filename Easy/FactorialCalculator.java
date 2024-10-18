public class FactorialCalculator {
    // Method to calculate factorial
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply result by each number up to n
        }
        return result;
    }
    public static void main(String[] args) {
        // Sample input values
        String[] testInputs = {"4", "0", "-5", "1", "Q", "3A"};
        for (String input : testInputs) {
            try {
                int n = Integer.parseInt(input); // Try to parse input to an integer
                // Validate input
                if (n < 0) {
                    System.out.println("Factorial is not defined for negative numbers. Input: " + n);
                } else {
                    long result = factorial(n); // Calculate factorial
                    System.out.println(n + " Factorial = " + result);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + input + ". Please enter a valid integer.");
            }
        }
    }
}
