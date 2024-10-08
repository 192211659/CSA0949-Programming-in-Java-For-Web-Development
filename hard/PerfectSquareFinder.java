import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectSquareFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();

        // Validate ranges
        if (lowerRange > upperRange) {
            System.out.println("Lower range cannot be greater than upper range.");
            return;
        }

        if (upperRange < 0) {
            System.out.println("Upper range must be non-negative.");
            return;
        }

        List<Integer> perfectSquares = findPerfectSquaresInRange(lowerRange, upperRange);
        System.out.println(perfectSquares);
        
        scanner.close();
    }

    // Method to find perfect squares in the specified range
    public static List<Integer> findPerfectSquaresInRange(int lower, int upper) {
        List<Integer> perfectSquares = new ArrayList<>();
        int start = (int) Math.ceil(Math.sqrt(lower)); // Start from the smallest integer whose square is >= lower
        int end = (int) Math.floor(Math.sqrt(upper));  // End at the largest integer whose square is <= upper

        for (int i = start; i <= end; i++) {
            int square = i * i;
            if (sumOfDigits(square) < 10) {
                perfectSquares.add(square);
            }
        }

        return perfectSquares;
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
