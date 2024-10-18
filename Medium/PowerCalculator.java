public class PowerCalculator {

    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;

        double result = myPow(x, n);
        System.out.printf("Result: %.5f%n", result);
    }

    public static double myPow(double x, int n) {
        // Handle the case where n is negative
        if (n < 0) {
            x = 1 / x; // Convert to positive power
            n = -n;    // Make n positive
        }

        return power(x, n);
    }

    private static double power(double x, int n) {
        if (n == 0) {
            return 1; // Base case: x^0 = 1
        }
        if (n == 1) {
            return x; // Base case: x^1 = x
        }

        double half = power(x, n / 2); // Recursive call
        if (n % 2 == 0) {
            return half * half; // Even exponent
        } else {
            return half * half * x; // Odd exponent
        }
    }
}
