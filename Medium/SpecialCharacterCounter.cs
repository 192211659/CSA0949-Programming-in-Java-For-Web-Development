import java.util.Scanner;

public class SpecialCharacterCounter {

    // Function to count special characters
    public static int countSpecialCharacters(String statement) {
        int specialCharCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);

            // Check if the character is not a letter, digit, or space
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++; // Increment the special character count
            }
        }

        return specialCharCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a statement: ");
        String statement = sc.nextLine();

        // Count the number of special characters
        int specialCharCount = countSpecialCharacters(statement);

        System.out.println("Number of special characters: " + specialCharCount);
    }
}
