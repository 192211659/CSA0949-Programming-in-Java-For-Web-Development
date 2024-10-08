import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Given Number: ");
        int number = scanner.nextInt();
        
        System.out.print("N = ");
        int n = scanner.nextInt();

        // Validate inputs
        if (number <= 0) {
            System.out.println("Given Number must be positive.");
            return;
        }

        if (n <= 0) {
            System.out.println("N must be a positive integer.");
            return;
        }

        // Calculate factors
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }

        // Output number of factors
        int numberOfFactors = factors.size();
        System.out.println("Number of factors = " + numberOfFactors);

        // Output the nth factor
        if (n > numberOfFactors) {
            System.out.println("There are not enough factors to retrieve the " + n + "th factor.");
        } else {
            System.out.println(n + "th factor of " + number + " = " + factors.get(n - 1));
        }

        scanner.close();
    }
}
