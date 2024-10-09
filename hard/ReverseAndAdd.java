import java.util.Scanner;

public class ReverseAndAdd {

    // Function to reverse the number
    public static long reverseNumber(long num) {
        long reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }

    // Function to check if the number is a palindrome
    public static boolean isPalindrome(long num) {
        return num == reverseNumber(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in());

        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        // Validate input (must be a positive integer)
        try {
            long number = Long.parseLong(input);

            if (number < 0) {
                System.out.println("Negative numbers are not allowed.");
                return;
            }

            int steps = 0; // Track how many steps were taken to find the palindrome

            // Perform reverse and add until we get a palindrome
            while (!isPalindrome(number)) {
                long reversed = reverseNumber(number);
                long newNumber = number + reversed;
                System.out.println(number + " + " + reversed + " = " + newNumber);
                number = newNumber;
                steps++;
            }

            System.out.println("Palindrome found: " + number + " (in " + steps + " steps)");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer number.");
        }
    }
}
