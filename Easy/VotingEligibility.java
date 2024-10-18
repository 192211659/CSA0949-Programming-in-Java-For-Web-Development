import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for their age
        System.out.print("Enter your age: ");
        String input = scanner.nextLine();
        
        // Check if the input is a valid integer
        if (input.matches("-?\\d+")) { // This regex allows an optional negative sign
            int age = Integer.parseInt(input);

            // Check if the age is valid
            if (age < 0) {
                System.out.println("Invalid age. Please enter a non-negative integer.");
            } else if (age < 18) {
                // If the age is less than 18, calculate years left to vote
                int yearsLeft = 18 - age;
                System.out.println("You are allowed to vote after " + yearsLeft + " years.");
            } else {
                // If age is 18 or older, the person is eligible to vote
                System.out.println("You are eligible to vote.");
            }
        } else {
            // Handle invalid input
            System.out.println("Invalid input. Please enter a valid age.");
        }
    }
}
