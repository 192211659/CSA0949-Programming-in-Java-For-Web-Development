import java.util.Scanner;

class Customer {
    private int accountNo;
    private String accName;
    private double balance;

    // Constructor to initialize the account details
    public Customer(int accountNo, String accName, double balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }

    // Synchronized method to deposit an amount
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs. " + amount + " deposited successfully. New balance: Rs. " + balance);
            notify(); // Notify the waiting thread (if any) to resume the withdraw operation
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Synchronized method to withdraw an amount
    public synchronized void withdraw(double amount) {
        System.out.println("Attempting to withdraw Rs. " + amount);

        if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
            return;
        }

        // If balance is insufficient, wait until a deposit is made
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            try {
                wait(); // Suspend the thread until the balance is updated
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Perform the withdrawal after sufficient balance is available
        balance -= amount;
        System.out.println("Withdraw operation success. Remaining balance: Rs. " + balance);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + accName);
        System.out.println("Balance: Rs. " + balance);
    }
}

public class BankSystem {

    public static void main(String[] args) {
        // Initializing account with Rs. 10000 balance
        Customer account = new Customer(101, "John Doe", 10000);
        Scanner sc = new Scanner(System.in);

        // Display initial account details
        System.out.println("Initial Account Details:");
        account.displayAccountDetails();

        // Creating thread for withdrawal operation
        new Thread(() -> {
            System.out.print("\nEnter amount to withdraw: ");
            double withdrawAmount = 0;
            try {
                withdrawAmount = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid amount.");
                return;
            }
            account.withdraw(withdrawAmount);
        }).start();

        // Creating thread for deposit operation
        new Thread(() -> {
            System.out.print("\nEnter amount to deposit: ");
            double depositAmount = 0;
            try {
                depositAmount = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid amount.");
                return;
            }
            account.deposit(depositAmount);
        }).start();
    }
}
