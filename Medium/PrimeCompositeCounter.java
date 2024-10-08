import java.util.Scanner;

public class PrimeCompositeCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers (type 'done' to finish):");
        int primeCount = 0;
        int compositeCount = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                
                // Check for prime and composite
                if (number > 1) {
                    if (isPrime(number)) {
                        primeCount++;
                    } else {
                        compositeCount++;
                    }
                }
            } else {
                // Handle non-integer input
                String invalidInput = scanner.next();
                System.out.println("Invalid input ignored: " + invalidInput);
            }
        }

        // Print results
        System.out.println("Composite numbers: " + compositeCount);
        System.out.println("Prime numbers: " + primeCount);

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; // Found a divisor
        }
        return true; // No divisors found, it's prime
    }
}
