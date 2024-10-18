public class FactorCounter {
    public static void main(String[] args) {
        // Sample input numbers
        int[] testNumbers = {100, 343, 1080, -243, 101010, 0};

        for (int number : testNumbers) {
            int factorCount = countFactors(number);
            System.out.println("Given number: " + number);
            System.out.println("Number of factors = " + factorCount);
            System.out.println();
        }
    }
    public static int countFactors(int n) {
        // Handle invalid inputs
        if (n <= 0) {
            return 0; // No factors for negative numbers and zero
        }
        int count = 0;
        // Loop to find factors
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++; // Count the factor
                if (i != n / i) {
                    count++; // Count the complementary factor
                }
            }
        }
        return count;
    }
}
