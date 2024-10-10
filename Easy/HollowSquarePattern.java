import java.util.Scanner;
public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the square and the symbol to print
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();
        System.out.print("Enter the symbol to use: ");
        char symbol = scanner.next().charAt(0);

        // Loop through each row
        for (int i = 1; i <= size; i++) {
            // Loop through each column
            for (int j = 1; j <= size; j++) {
                // Print the symbol at the boundary (first and last rows and columns)
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print(symbol + " ");
                } else {
                    // Print spaces inside the square
                    System.out.print("  ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
