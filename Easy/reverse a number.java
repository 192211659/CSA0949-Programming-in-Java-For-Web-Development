import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Number: ");
        String input = scanner.nextLine();
        // Check if the input is a valid number
        if (input.matches("-?\\d+")) {  // This regex allows optional minus sign for negative numbers
            int number = Integer.parseInt(input);
            int reverse = 0;
            boolean isNegative = number < 0; // Check if the number is negative
            // If the number is negative, make it positive for the reversal process
            if (isNegative) {
                number = -number;
            }
            // Reverse the number
            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            }
            // If the original number was negative, make the reverse negative
            if (isNegative) {
                reverse = -reverse;
            }
            // Output the reversed number
            System.out.println("Reverse Number: " + reverse);
        } else {
            // Handle invalid input
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
