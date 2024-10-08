import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input: Get the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to an integer
        try {
            int convertedInt = Integer.parseInt(inputString);

            // Output: Display the integer
            System.out.println("Output Integer: " + convertedInt);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number string.");
        }
    }
}
