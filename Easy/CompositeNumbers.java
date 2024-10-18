public class CompositeNumbers {
    // Method to check if a number is composite
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not composite
        }
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count > 2; // A composite number has more than 2 divisors
    }
    public static void main(String[] args) {
        // Sample input values
        int A = 12; // Change this value for different test cases
        int B = 19; // Change this value for different test cases
        // Validate input
        if (A > B) {
            System.out.println("A should be less than or equal to B.");
            return;
        }
        System.out.print("Composite numbers between " + A + " and " + B + ": ");
        boolean foundComposite = false; // Flag to check if we found any composite numbers
        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                System.out.print(i + (i < B ? ", " : "")); // Print the number with a comma if not the last
                foundComposite = true; // Set the flag to true if a composite number is found
            }
        }
        if (!foundComposite) {
            System.out.println("None"); // If no composite numbers were found
        } else {
            System.out.println(); // New line after output
        }
    }
}
