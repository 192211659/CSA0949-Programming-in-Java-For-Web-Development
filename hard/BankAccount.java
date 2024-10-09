import java.util.Scanner;

class BankAccount {
    // Data members
    private String depositorName;
    private int accountNumber;
    private String accountType; // S for Savings, C for Current
    private double balanceAmount;

    // Constructor
    public BankAccount(String depositorName, int accountNumber, String accountType, double initialBalance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balanceAmount = initialBalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        balanceAmount += amount;
        System.out.println("Rs. " + amount + " deposited. Current balance: Rs. " + balanceAmount);
    }

    // Method to withdraw amount (ensuring minimum balance of Rs. 500.00)
    public void withdraw(double amount) {
        if (balanceAmount - amount < 500.00) {
            System.out.println("Withdrawal denied! Minimum balance of Rs. 500.00 must be maintained.");
        } else {
            balanceAmount -= amount;
            System.out.println("Rs. " + amount + " withdrawn. Current balance: Rs. " + balanceAmount);
        }
    }

    // Method to display account information and balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs. " + balanceAmount);
    }
    
    // Method to update account information
    public void updateInfo(String depositorName, int accountNumber, String accountType) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initializing the bank account with a balance of Rs. 10000
        BankAccount account = new BankAccount("Raja", 100, "S", 10000);

        // Test case 1: Display initial account details
        System.out.println("Initial Account Details:");
        account.displayBalance();
        
        // Test case 2: Depositing an amount
        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        
        // Test case 3: Withdrawing an amount
        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        
        // Test case 4: Updating account information
        System.out.print("\nEnter new depositor name: ");
        String newName = sc.next();
        System.out.print("Enter new account number: ");
        int newAccountNumber = sc.nextInt();
        System.out.print("Enter account type (S for Savings, C for Current): ");
        String newAccountType = sc.next();
        account.updateInfo(newName, newAccountNumber, newAccountType);
        
        // Display updated account details
        System.out.println("\nUpdated Account Details:");
        account.displayBalance();
    }
}
