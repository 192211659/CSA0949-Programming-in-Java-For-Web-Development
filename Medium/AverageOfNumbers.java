import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveSum = 0, positiveCount = 0;
        int negativeSum = 0, negativeCount = 0;

        while (true) {
            System.out.print("Enter the number (-1 to exit): ");
            int number = sc.nextInt();

            if (number == -1) {
                break;
            }

            if (number > 0) {
                positiveSum += number;
                positiveCount++;
            } else if (number < 0) {
                negativeSum += number;
                negativeCount++;
            }
        }

        // Calculate and print average of positive numbers
        if (positiveCount > 0) {
            double positiveAverage = (double) positiveSum / positiveCount;
            System.out.println("The average of positive numbers is: " + positiveAverage);
        } else {
            System.out.println("No positive numbers entered.");
        }

        // Calculate and print average of negative numbers
        if (negativeCount > 0) {
            double negativeAverage = (double) negativeSum / negativeCount;
            System.out.println("The average of negative numbers is: " + negativeAverage);
        } else {
            System.out.println("No negative numbers entered.");
        }
    }
}
