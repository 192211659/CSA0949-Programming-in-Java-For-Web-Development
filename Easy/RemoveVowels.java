import java.util.Scanner;

public class RemoveVowels {
    
    // Function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);  // Convert character to lowercase for uniform comparison
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting string input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!isVowel(ch)) {  // If the character is not a vowel, append it to the result
                result.append(ch);
            }
        }

        // Display the result string without vowels
        System.out.println("The string without vowels is: " + result.toString());
    }
}
