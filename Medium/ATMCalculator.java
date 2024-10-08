import java.util.Scanner;

public class ATMCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Variables to store denominations and counts
        int denomination, count, totalBalance = 0;
        
        // Loop to get user input for 4 denominations
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter the " + i + "st Denomination: ");
            denomination = sc.nextInt();
            
            System.out.print("Enter the " + i + "st Denomination number of notes: ");
            count = sc.nextInt();
            
            // Calculate total balance for this denomination
            totalBalance += denomination * count;
        }
        
        // Display the total available balance
        System.out.println("Total Available Balance in ATM: " + totalBalance);
        
        // Close the scanner
        sc.close();
    }
}
