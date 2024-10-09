import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numberCount = 0;

        while (true) {
            System.out.print("Enter any character (* to exit): ");
            char ch = sc.next().charAt(0);

            if (ch == '*') {
                break;
            }

            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }

        // Display the results
        System.out.println("Total count of lowercase: " + lowerCaseCount);
        System.out.println("Total count of uppercase: " + upperCaseCount);
        System.out.println("Total count of numbers: " + numberCount);
    }
}
