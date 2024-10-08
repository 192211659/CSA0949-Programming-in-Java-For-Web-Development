import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N = ");
        String input = scanner.nextLine();

        // Validate input and convert to integer
        int n;
        try {
            n = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("N must be a valid integer.");
            return;
        }

        // Validate the value of N
        if (n <= 0) {
            System.out.println("N must be a positive integer.");
            return;
        }

        // Get the nth prime number
        int nthPrime = getNthPrime(n);
        System.out.println(n + "rd Prime number is " + nthPrime);

        // Get the next n prime numbers after nth prime
        List<Integer> nextPrimes = getNextNPrimes(nthPrime, n);
        System.out.print(n + " prime numbers after " + nthPrime + " are: ");
        for (int i = 0; i < nextPrimes.size(); i++) {
            System.out.print(nextPrimes.get(i));
            if (i < nextPrimes.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        scanner.close();
    }

    // Method to find the nth prime number
    public static int getNthPrime(int n) {
        int count = 0;
        int number = 1;
        while (count < n) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }
        return number;
    }

    // Method to find the next n prime numbers after a given prime number
    public static List<Integer> getNextNPrimes(int startPrime, int n) {
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        int number = startPrime + 1;

        while (count < n) {
            if (isPrime(number)) {
                primes.add(number);
                count++;
            }
            number++;
        }
        return primes;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
