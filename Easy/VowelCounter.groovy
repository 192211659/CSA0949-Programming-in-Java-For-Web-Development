import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a statement
        System.out.println("Enter a statement: ");
        String statement = scanner.nextLine(); // Read the entire line including spaces

        int vowelCount = 0;

        // Convert the statement to lower case to make the comparison case insensitive
        statement = statement.toLowerCase();

        // Count vowels
        for (char ch : statement.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Print the number of vowels
        System.out.println("Number of vowels = " + vowelCount);
        scanner.close();
    }
}
