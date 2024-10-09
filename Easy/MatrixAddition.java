import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the matrices
        System.out.println("Enter the number of rows and columns for the matrices: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Declare two matrices and a result matrix
        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Input elements of Mat1
        System.out.println("Enter elements of Mat1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }

        // Input elements of Mat2
        System.out.println("Enter elements of Mat2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Output the resulting matrix
        System.out.println("Matrix sum is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
