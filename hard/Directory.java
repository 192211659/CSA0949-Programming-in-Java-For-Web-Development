import java.util.ArrayList;
import java.util.Scanner;

// Class to represent a person in the directory
class Person {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private String uniqueID;

    // Constructor
    public Person(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + (telephoneNumber != null ? telephoneNumber : "N/A"));
        System.out.println("Mobile Number: " + (mobileNumber != null ? mobileNumber : "N/A"));
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println("Unique ID No: " + uniqueID);
        System.out.println();
    }
}

// Main class to create the directory
public class Directory {
    private ArrayList<Person> directory;

    // Constructor
    public Directory() {
        directory = new ArrayList<>();
    }

    // Method to add a person to the directory
    public void addPerson(Person person) {
        directory.add(person);
    }

    // Method to display all persons in the directory
    public void displayDirectory() {
        if (directory.isEmpty()) {
            System.out.println("The directory is empty.");
        } else {
            System.out.println("Directory Entries:");
            for (Person person : directory) {
                person.displayDetails();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Directory directory = new Directory();
        String choice;

        do {
            // Input details for a new person
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter Telephone Number (if available, else leave blank): ");
            String telephoneNumber = scanner.nextLine();
            telephoneNumber = telephoneNumber.isEmpty() ? null : telephoneNumber;

            System.out.print("Enter Mobile Number (if available, else leave blank): ");
            String mobileNumber = scanner.nextLine();
            mobileNumber = mobileNumber.isEmpty() ? null : mobileNumber;

            System.out.print("Enter Head of Family: ");
            String headOfFamily = scanner.nextLine();

            System.out.print("Enter Unique ID No: ");
            String uniqueID = scanner.nextLine();

            // Create a new Person object and add it to the directory
            Person person = new Person(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
            directory.addPerson(person);

            // Ask user if they want to add another entry
            System.out.print("Do you want to add another person? (yes/no): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        // Display the directory
        directory.displayDirectory();
    }
}
