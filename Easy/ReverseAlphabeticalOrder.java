import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.println("Enter the word: ");
        String inputWord = scanner.nextLine();

        // Convert the word into a character array
        char[] letters = inputWord.toCharArray();

        // Sort the array in alphabetical order
        Arrays.sort(letters);

        // Create a StringBuilder to hold the reversed order
        StringBuilder reverseOrder = new StringBuilder();

        // Append the characters in reverse order
        for (int i = letters.length - 1; i >= 0; i--) {
            reverseOrder.append(letters[i]).append(" ");
        }

        // Print the result
        System.out.println("Alphabetical Order: " + reverseOrder.toString().trim());
        
        scanner.close();
    }
}
