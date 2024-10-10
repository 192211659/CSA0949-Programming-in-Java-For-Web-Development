import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample input for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize an array to hold the numbers
        int[] numbers = new int[n];

        // Get the numbers from the user
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            // Try-catch to handle ArrayIndexOutOfBoundsException
            try {
                numbers[i] = scanner.nextInt();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: You tried to access an index outside of the array bounds.");
                return; // Exit the program
            }
        }

        // Calculate the sum of numbers
        int sum = 0;
        for (int i = 0; i <= n; i++) { // Intentional error: this will cause an exception when i == n
            sum += numbers[i];
        }

        // Print the result
        System.out.println("The sum is: " + sum);
        
        scanner.close();
    }
}
