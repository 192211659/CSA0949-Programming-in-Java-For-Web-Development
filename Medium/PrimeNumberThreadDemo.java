public class PrimeNumberThreadDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] testCases = {5, 4, -10, 0, 11}; // Test cases with valid integers

        System.out.println("Test Cases:");
        for (int number : testCases) {
            // Check for invalid numbers or catch exceptions for invalid types
            try {
                // Check if the input is a valid integer
                Thread primeThread = new Thread(new PrimeChecker(number));
                primeThread.start();
                primeThread.join();
            } catch (Exception e) {
                System.out.println(number + " is not a valid integer input.");
            }
        }

        scanner.close();
    }
}
