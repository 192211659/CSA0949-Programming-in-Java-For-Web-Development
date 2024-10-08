import java.util.Scanner;

public class CollegeUserCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total users: ");
        int totalUsers = scanner.nextInt();
        
        System.out.print("Enter staff users: ");
        int staffUsers = scanner.nextInt();

        // Validate inputs
        if (totalUsers < 0) {
            System.out.println("Total Users cannot be negative.");
            return;
        }
        
        if (staffUsers < 0) {
            System.out.println("Staff Users cannot be negative.");
            return;
        }

        // Check if staff users exceed total users
        if (staffUsers > totalUsers) {
            System.out.println("Staff Users cannot exceed Total Users.");
            return;
        }

        // Calculate non-teaching staff users
        int nonTeachingStaffUsers = staffUsers / 3;

        // Calculate student users
        int studentUsers = totalUsers - (staffUsers + nonTeachingStaffUsers);

        // Check for negative student users
        if (studentUsers < 0) {
            System.out.println("The calculated number of student users is negative.");
        } else {
            System.out.println("Student Users: " + studentUsers);
        }

        scanner.close();
    }
}
