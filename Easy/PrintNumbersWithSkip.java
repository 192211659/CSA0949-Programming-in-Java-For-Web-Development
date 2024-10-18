public class PrintNumbersWithSkip {
    public static void main(String[] args) {
        // Sample input values
        int M = 50; // Change this value for different test cases
        int N = 100; // Change this value for different test cases
        int K = 7; // Change this value for different test cases
        // Validate input
        if (M > N) {
            System.out.println("M should be less than or equal to N.");
            return;
        }
        if (K < 0) {
            System.out.println("K should be a non-negative integer.");
            return;
        }
        System.out.print("Output: ");
        for (int i = M; i <= N; i += (K + 1)) {
            System.out.print(i);
            if (i + (K + 1) <= N) { // Check if it's not the last number
                System.out.print(", "); // Print comma and space if not the last number
            }
        }
        System.out.println(); // New line after output
    }
}
