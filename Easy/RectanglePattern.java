import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows, columns, and the symbol
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        System.out.print("Enter the symbol to use: ");
        char symbol = scanner.next().charAt(0);

        // Loop for each row
        for (int i = 0; i < rows; i++) {
            // Loop for each column in the row
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
