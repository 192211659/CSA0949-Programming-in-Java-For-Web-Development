import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // StringBuilder to hold the result
        StringBuilder result = new StringBuilder();

        // Loop through each character in the input string
        for (char ch : inputString.toCharArray()) {
            // Check if the character is a vowel
            if (!isVowel(ch)) {
                result.append(ch); // Add non-vowel characters to the result
            }
        }

        // Print the string without vowels
        System.out.println("The string without vowels is: " + result.toString());
        
        scanner.close();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for case-insensitive comparison
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
