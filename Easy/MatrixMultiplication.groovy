import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the matrices
        System.out.println("Enter the number of rows and columns for Mat1: ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();

        System.out.println("Enter the number of rows and columns for Mat2: ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();

        // Check if matrices can be multiplied
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible with these dimensions.");
            return;
        }

        // Input elements of Mat1
        int[][] mat1 = new int[rows1][cols1];
        System.out.println("Enter elements of Mat1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                mat1[i] = scanner.nextInt();
            }
        }

        // Input elements of Mat2
        int[][] mat2 = new int[rows2][cols2];
        System.out.println("Enter elements of Mat2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }

        // Matrix to store the result of multiplication
        int[][] result = new int[rows1][cols2];

        // Matrix multiplication logic
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        // Output the resulting matrix
        System.out.println("Matrix multiplication result:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
