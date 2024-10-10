import java.util.Scanner;

public class NumberPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the maximum number for the pattern
        System.out.print("Enter the maximum number: ");
        int maxNum = scanner.nextInt();

        // Print the ascending part of the pattern
        for (int i = 1; i <= maxNum; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Print the descending part of the pattern
        for (int i = maxNum - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
