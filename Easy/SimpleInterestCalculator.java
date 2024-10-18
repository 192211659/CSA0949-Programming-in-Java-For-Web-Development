public class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, int years) {
        return (principal * rate * years) / 100;
    }
    public static void main(String[] args) {
        double[] principals = {2000, 20000, -2000, 2, 0};
        int[] years = {0, -2, 2, 2000, 5};
        char[] seniorCitizens = {'n', 'n', 'n', 'n', 'n'};
        for (int i = 0; i < principals.length; i++) {
            double principal = principals[i];
            int year = years[i];
            char seniorCitizen = seniorCitizens[i];
            // Validate inputs
            if (principal < 0 || year < 0) {
                System.out.println("Test Case " + (i + 1) + ": Invalid input. Principal and years must be non-negative.");
                continue;
            }
            double rate = (seniorCitizen == 'y' || seniorCitizen == 'Y') ? 12 : 10;
            double interest = calculateSimpleInterest(principal, rate, year);
            System.out.printf("Test Case %d: Interest: %.2f\n", (i + 1), interest);
        }
    }
}
