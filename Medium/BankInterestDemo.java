import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bank {
    // A map to store bank names and their corresponding interest rates
    private Map<String, Double> bankRates;

    public Bank() {
        bankRates = new HashMap<>();
        // Initialize the bank rates
        bankRates.put("SBI", 8.4);
        bankRates.put("ICICI", 7.3);
        bankRates.put("AXIS", 9.7);
    }

    // Method to get the interest rate for a given bank
    public double getRateOfInterest(String bankName) {
        return bankRates.getOrDefault(bankName, 0.0); // Default to 0.0 if bank not found
    }

    // Method to update the interest rate for a given bank
    public void updateRate(String bankName, double newRate) {
        bankRates.put(bankName, newRate);
    }
}

public class BankInterestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        // Sample input for test cases
        String[] testCases = {
            "SBI, 8.3",
            "ICICI, 7.3",
            "AXIS, 9.7",
            "SBI, 8.6",
            "AXIS, 7.6"
        };

        // Process each test case
        System.out.println("Test Cases:");
        for (int i = 0; i < testCases.length; i++) {
            String[] parts = testCases[i].split(", ");
            String bankName = parts[0];
            double newRate = Double.parseDouble(parts[1]);

            // Update the interest rate
            bank.updateRate(bankName, newRate);

            // Print the updated interest rates for all banks
            System.out.println((i + 1) + ". " + bankName + ", " + bank.getRateOfInterest(bankName));
        }

        scanner.close();
    }
}
