import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter the string: ");
        String inputString = scanner.nextLine();

        // Prompt the user to enter a character to search
        System.out.println("Enter the character to be searched: ");
        char searchChar = scanner.next().charAt(0);

        // Variable to track if the character is found
        boolean found = false;

        // Search for the character in the string
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                System.out.println(searchChar + " is found in string at index: " + i);
                found = true;
                break; // Exit the loop after finding the first occurrence
            }
        }

        // If the character is not found
        if (!found) {
            System.out.println(searchChar + " is not found in the string.");
        }

        scanner.close();
    }
}
