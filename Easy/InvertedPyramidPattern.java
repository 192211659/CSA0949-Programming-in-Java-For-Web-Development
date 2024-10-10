import java.util.Scanner;
public class InvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the number of rows for the inverted pyramid
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        // Loop for each row
        for (int i = n; i >= 1; i--) {
            // Print spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars in decreasing order
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
        scanner.close();
    }
}
