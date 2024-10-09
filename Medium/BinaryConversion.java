import java.util.Scanner;

public class BinaryConversion {

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2); // Parse binary string to decimal integer
    }

    // Function to convert decimal to octal
    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal); // Convert decimal integer to octal string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        // Validate the binary input
        if (!binary.matches("[01]+")) {
            System.out.println("Error: Invalid binary number.");
            return;
        }

        // Convert binary to decimal
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal Number: " + decimal);

        // Convert decimal to octal
        String octal = decimalToOctal(decimal);
        System.out.println("Octal: " + octal);
    }
}
