import java.util.Scanner;

public class PerfectNumbers {

    // Function to check if a number is perfect
    public static boolean isPerfect(int number) {
        int sum = 0;
        // Find divisors and sum them
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // Function to print the first n perfect numbers
    public static void printPerfectNumbers(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int count = 0; // Counter for perfect numbers found
        int number = 1; // Start checking from 1

        System.out.print("First " + n + " perfect numbers are: ");
        while (count < n) {
            if (isPerfect(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println(); // Print new line at the end
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of perfect numbers to print
        System.out.print("Enter the value of N: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }

        int n = sc.nextInt();
        printPerfectNumbers(n);
    }
}
