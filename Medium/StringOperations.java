import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Accept the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // i) Replace any word in the given String
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();
        String replacedString = inputString.replace(wordToReplace, newWord);
        System.out.println("String after replacement: " + replacedString);

        // ii) Find the length of the string
        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        // iii) Uppercase conversion
        String upperCaseString = inputString.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseString);

        // Close the scanner
        scanner.close();
    }
}
