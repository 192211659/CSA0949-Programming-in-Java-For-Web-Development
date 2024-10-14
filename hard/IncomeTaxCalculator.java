import java.util.Scanner;

public class IncomeTaxCalculator {

    // Method to calculate tax based on income
    public static double calculateTax(double income) {
        double tax = 0;
        double taxableIncome = income - 250000; // Only income above 2,50,000 is taxable

        // No tax if income is less than or equal to 2,50,000
        if (income <= 250000) {
            return tax;  // No tax
        }

        // Tax for income between 2,50,001 and 5,00,000
        if (income > 250000 && income <= 500000) {
            tax = taxableIncome * 0.10;  // 10% tax
        }
        // Tax for income between 5,00,001 and 10,00,000
        else if (income > 500000 && income <= 1000000) {
            tax = 250000 * 0.10 + (income - 500000) * 0.20;  // 10% on first 2,50,000 and 20% on the rest
        }
        // Tax for income above 10,00,001
        else if (income > 1000000) {
            tax = 250000 * 0.10 + 500000 * 0.20 + (income - 1000000) * 0.30;  // 10% on 2,50,000, 20% on next 5,00,000, 30% on rest
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input income
        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();

        if (income < 0) {
            System.out.println("Income cannot be negative.");
            return;
        }

        // Calculate tax
        double tax = calculateTax(income);

        // Display results
        System.out.println("Taxable Income: " + (income > 250000 ? income - 250000 : 0));
        System.out.println("Tax = " + tax);
    }
}
