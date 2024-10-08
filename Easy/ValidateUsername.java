import java.util.Scanner;
public class ValidateUsername {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Input: Get the username from the user
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        // Validate the username
        if (isValidUsername(username)) {
            System.out.println("Valid Username!");
        } else {
            System.out.println("Invalid Username!");
        }
    }
    // Method to validate the username
    public static boolean isValidUsername(String username) {
        // Check if the length is at least 5 characters
        if (username.length() < 5) {
            return false;
        }

        // Check if the username contains only letters and digits
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        return true;
    }
}
