import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniquePermutations {

    // Function to generate permutations
    public static void generatePermutations(String str, String prefix, Set<String> permutations) {
        if (str.length() == 0) {
            permutations.add(prefix); // Add the permutation to the set (duplicates are automatically handled)
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(rem, prefix + str.charAt(i), permutations);
            }
        }
    }

    // Function to check if the input is valid and handle negative cases
    public static String validateInput(String input) {
        if (input.matches("-?[0-9]+")) { // Check if input is a valid integer
            return input.replace("-", ""); // Remove negative sign for generating permutations
        } else {
            return null; // Invalid input
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        // Validate and process input
        String validInput = validateInput(input);
        if (validInput == null) {
            System.out.println("Error: Invalid number.");
            return;
        }

        // Create a set to store unique permutations
        Set<String> permutations = new HashSet<>();

        // Generate permutations
        generatePermutations(validInput, "", permutations);

        // Display the unique permutations
        System.out.println("Permutations are: ");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}
