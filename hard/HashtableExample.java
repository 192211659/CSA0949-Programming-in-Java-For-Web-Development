import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Scanner;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, String> hashtable = new Hashtable<>();

        // Adding key-value pairs to the Hashtable
        hashtable.put("101", "Alice");
        hashtable.put("102", "Bob");
        hashtable.put("103", "Charlie");
        hashtable.put("104", "Diana");

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Search for a key
        System.out.print("Enter a key to search: ");
        String searchKey = scanner.nextLine();

        // Check if the key exists
        if (hashtable.containsKey(searchKey)) {
            System.out.println("Value for key " + searchKey + ": " + hashtable.get(searchKey));
        } else {
            System.out.println("Key " + searchKey + " not found in the Hashtable.");
        }

        // Display all keys and values using Enumeration
        System.out.println("\nAll key-value pairs in the Hashtable:");
        Enumeration<String> keys = hashtable.keys();
        Enumeration<String> values = hashtable.elements();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = values.nextElement();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Close the scanner
        scanner.close();
    }
}
