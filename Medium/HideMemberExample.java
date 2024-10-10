import java.util.Scanner;

class SuperClass {
    int value;

    // Parameterized constructor
    public SuperClass(int value) {
        this.value = value;
        System.out.println("SuperClass constructor called with value: " + value);
    }
}

class SubClass extends SuperClass {
    int value; // Hiding member of the superclass

    // Parameterized constructor
    public SubClass(int superValue, int subValue) {
        super(superValue); // Call to superclass constructor
        this.value = subValue; // Initialize subclass variable
    }

    public void displayValues() {
        // Displaying both superclass and subclass values
        System.out.println("SuperClass value: " + super.value + ", SubClass value: " + this.value);
    }
}

public class HideMemberExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Sample inputs for test cases
        int[][] testCases = {
            {10, 20},
            {-20, -30},
            {0, 0},
            {8, 5}, // Adjusted from "EIGHT FIVE" to integers
            {10, 12} // Adjusted from "10.57, 12.58" to integers
        };

        System.out.println("Test Cases:");
        for (int i = 0; i < testCases.length; i++) {
            SubClass obj = new SubClass(testCases[i][0], testCases[i][1]);
            obj.displayValues();
        }

        scanner.close();
    }
}
