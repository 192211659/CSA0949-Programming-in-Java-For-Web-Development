import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows to print
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print the number 'i' in each row 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "  "); // Two spaces for better alignment
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
