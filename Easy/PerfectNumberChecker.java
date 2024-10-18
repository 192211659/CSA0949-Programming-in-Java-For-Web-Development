public class PerfectNumberChecker {
    public static void main(String[] args) {
        // Sample input numbers
        int[] testNumbers = {6, 17, 26, 143, 841, -963};
        for (int number : testNumbers) {
            System.out.println("Given Number: " + number);
            if (isPerfectNumber(number)) {
                System.out.println("It’s a Perfect Number\n");
            } else {
                System.out.println("It’s not a Perfect Number\n");
            }
        }
    }
    public static boolean isPerfectNumber(int n) {
        // Handle invalid inputs
        if (n <= 0) {
            return false; // Only positive numbers can be perfect
        }
        int sum = 0;
        // Calculate the sum of proper divisors
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n; // Check if the sum of divisors equals the number
    }
}