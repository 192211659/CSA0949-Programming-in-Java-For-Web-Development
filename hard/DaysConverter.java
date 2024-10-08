import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();
        
        // Handle negative and zero input
        if (totalDays < 0) {
            System.out.println("Invalid input. Number of days cannot be negative.");
        } else {
            // Calculate years, weeks, and days
            int years = totalDays / 365;
            int remainingDays = totalDays % 365;
            int weeks = remainingDays / 7;
            int days = remainingDays % 7;

            // Display the result
            System.out.println("No. of years: " + years);
            System.out.println("No. of weeks: " + weeks);
            System.out.println("No. of days: " + days);
        }

        // Close the scanner
        sc.close();
    }
}
