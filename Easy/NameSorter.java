import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        
        // Input names
        System.out.println("Enter names (type 'done' to stop):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            names.add(name);
        }

        // Get sorting order from the user
        System.out.print("Order (A for Ascending / D for Descending): ");
        char order = scanner.next().charAt(0);

        // Sort names based on user's choice
        if (order == 'A' || order == 'a') {
            Collections.sort(names); // Ascending
        } else if (order == 'D' || order == 'd') {
            Collections.sort(names, Collections.reverseOrder()); // Descending
        } else {
            System.out.println("Invalid input. Please enter A or D.");
            return;
        }

        // Output sorted names
        System.out.println("\nSorted names:");
        for (String name : names) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}
