import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows to print
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print the squares
            for (int j = 1; j <= i; j++) {
                int square = (i * j) * (i * j); // Calculate the square of the current number
                System.out.printf("%-5d", square); // Print the square with a width of 5
            }
            // Move to the next line after each row
            System.out.println();
        }
        scanner.close();
    }
}
