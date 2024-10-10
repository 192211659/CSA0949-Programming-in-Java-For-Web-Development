import java.util.Scanner;

public class PascalTriangle {
    // Function to calculate binomial coefficient or combination (nCr)
    static int binomialCoeff(int n, int k) {
        int res = 1;
        if (k > n - k)
            k = n - k;
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Loop for each row
        for (int i = 0; i < n; i++) {
            // Print spaces for alignment
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            // Print Pascal's triangle values
            for (int k = 0; k <= i; k++) {
                System.out.print(binomialCoeff(i, k) + "   ");
            }
            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
