import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the character to be printed and max number of times to print
        System.out.print("Enter the Character to be printed: ");
        char ch = scanner.next().charAt(0);
        System.out.print("Max Number of times printed: ");
        int maxTimes = scanner.nextInt();

        // Loop for each row
        for (int i = 1; i <= maxTimes; i++) {
            // Print the character i times in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
