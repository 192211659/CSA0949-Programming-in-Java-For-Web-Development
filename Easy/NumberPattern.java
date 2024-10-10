import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to be printed and max number of times to print
        System.out.print("Enter the number to be printed: ");
        int num = scanner.nextInt();
        System.out.print("Max Number of times printed: ");
        int maxTimes = scanner.nextInt();

        // First half of the pattern
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }

        // Second half of the pattern
        for (int i = maxTimes - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }

        scanner.close();
    }
}
