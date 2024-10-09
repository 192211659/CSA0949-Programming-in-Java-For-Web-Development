import java.util.Scanner;

public class Factorial {

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        
        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(n);
            System.out.println("The factorial of " + n + " is: " + result);
        }
    }
}
