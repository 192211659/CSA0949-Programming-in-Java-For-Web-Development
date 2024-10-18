import java.util.HashMap;

public class BankDetails {
    public static void main(String[] args) {
        // Create a HashMap to store bank details
        HashMap<String, String> bankDetails = new HashMap<>();

        // i) Add 3 records
        addRecord(bankDetails, "ACC001", "John Doe");
        addRecord(bankDetails, "ACC002", "Jane Smith");
        addRecord(bankDetails, "ACC003", "Alice Johnson");

        // ii) Display the size of HashTable
        System.out.println("Size of HashTable: " + bankDetails.size());

        // iii) Clear the HashTable
        bankDetails.clear();
        System.out.println("HashTable cleared. Size after clearing: " + bankDetails.size());
    }

    // Method to add a record to the HashTable
    public static void addRecord(HashMap<String, String> bankDetails, String accountNumber, String customerName) {
        bankDetails.put(accountNumber, customerName);
        System.out.println("Added Record: " + accountNumber + " -> " + customerName);
    }
}
