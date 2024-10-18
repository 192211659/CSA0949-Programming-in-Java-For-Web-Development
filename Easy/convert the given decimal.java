import java.util.Scanner;
public class DecimalToBinaryReverse {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Input: ");
        String input = scanner.nextLine();
        // Check if the input is a valid integer
        if (input.matches("-?\\d+")) { // This regex allows optional minus sign for negative numbers
            int decimal = Integer.parseInt(input);
            if (decimal < 0) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
                return;
            }
            // Convert decimal to binary
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary: " + binary);
            // Reverse the binary string
            String reversedBinary = new StringBuilder(binary).reverse().toString();
            System.out.println("Reversed Binary: " + reversedBinary);
            // Convert the reversed binary string back to decimal
            int reversedDecimal = Integer.parseInt(reversedBinary, 2);
            System.out.println("Output: " + reversedDecimal);
        } else {
            // Handle invalid input
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
