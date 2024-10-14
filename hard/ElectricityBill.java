import java.util.Scanner;

// Class to represent an electricity consumer
class ElectricityBill {
    private String consumerNo;
    private String consumerName;
    private double previousMonthReading;
    private double currentMonthReading;

    // Constructor
    public ElectricityBill(String consumerNo, String consumerName, double previousMonthReading, double currentMonthReading) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousMonthReading = previousMonthReading;
        this.currentMonthReading = currentMonthReading;
    }

    // Method to calculate the bill amount based on tariff
    public double calculateBill() {
        double unitsConsumed = currentMonthReading - previousMonthReading;
        double billAmount = 0;

        // Calculate bill amount based on consumption
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1.00; // Rs. 1 per unit
        } else if (unitsConsumed <= 200) {
            billAmount = (100 * 1.00) + ((unitsConsumed - 100) * 2.50); // Rs. 2.50 per unit
        } else if (unitsConsumed <= 500) {
            billAmount = (100 * 1.00) + (100 * 2.50) + ((unitsConsumed - 200) * 4.00); // Rs. 4 per unit
        } else {
            billAmount = (100 * 1.00) + (100 * 2.50) + (300 * 4.00) + ((unitsConsumed - 500) * 6.00); // Rs. 6 per unit
        }

        return billAmount;
    }

    // Method to display the bill details
    public void displayBill() {
        double billAmount = calculateBill();
        System.out.println("Electricity Bill Details:");
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.printf("Previous Month Reading: %.2f\n", previousMonthReading);
        System.out.printf("Current Month Reading: %.2f\n", currentMonthReading);
        System.out.printf("Units Consumed: %.2f\n", currentMonthReading - previousMonthReading);
        System.out.printf("Total Bill Amount: Rs. %.2f\n", billAmount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input consumer details
        System.out.print("Enter Consumer No: ");
        String consumerNo = scanner.nextLine();

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        double previousMonthReading = scanner.nextDouble();

        System.out.print("Enter Current Month Reading: ");
        double currentMonthReading = scanner.nextDouble();

        // Create an ElectricityBill object
        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousMonthReading, currentMonthReading);

        // Display the bill
        bill.displayBill();
    }
}
