import java.util.Scanner;

public class DecimalConverter {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt user for decimal number input
        System.out.print("Enter a Decimal Number: ");
        String input = sc.nextLine();

        try {
            // Check if input is a valid decimal integer
            int decimal = Integer.parseInt(input);

            // Convert decimal number to binary and octal
            String binary = Integer.toBinaryString(decimal);
            String octal = Integer.toOctalString(decimal);

            // Display the results
            System.out.println("Binary Number = " + binary);
            System.out.println("Octal Number = " + octal);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid decimal number.");
        }

        // Close the scanner
        sc.close();
    }
}
