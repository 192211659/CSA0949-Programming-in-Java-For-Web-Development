import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");

        // Read the input line
        String inputLine = scanner.nextLine();

        // Initialize a StringBuilder to store special characters
        StringBuilder specialCharacters = new StringBuilder();
        int specialCharacterCount = 0;

        // Define what is considered a special character
        for (char ch : inputLine.toCharArray()) {
            // Check if the character is a special character
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharacters.append(ch);
                specialCharacterCount++;
            }
        }

        // Print the results
        System.out.println("Special characters: " + specialCharacters);
        System.out.println("Number of special characters: " + specialCharacterCount);
        
        // Close the scanner
        scanner.close();
    }
}
