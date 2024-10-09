import java.util.Scanner;

public class CompositeNumbers {

    // Function to check if a number is composite
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false; // 0, 1, and negative numbers are not composite
        }
        int divisorCount = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisorCount++;
            }
        }
        return divisorCount > 2; // A composite number has more than 2 divisors
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array
        int[] arr = {16, 18, 27, 16, 23, 21, 19};

        int compositeCount = 0;

        // Loop through the array to count composite numbers
        for (int num : arr) {
            if (isComposite(num)) {
                compositeCount++;
            }
        }

        // Output the result
        System.out.println("Number of Composite Numbers = " + compositeCount);
    }
}
