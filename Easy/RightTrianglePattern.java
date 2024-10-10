import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars for the triangle
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
        
        scanner.close();
    }
}
