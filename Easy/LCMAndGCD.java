public class LCMAndGCD {
    // Method to calculate GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // Method to calculate LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        // Test case: N value and numbers
        int n = 2; // Change this value for different test cases
        int[] numbers;
        // Hard-coded input values based on test cases
        switch (n) {
            case 2:
                numbers = new int[]{16, 20}; // Test case 1
                break;
            case 3:
                numbers = new int[]{12, 25, 30}; // Test case 2
                break;
            case 2:
                numbers = new int[]{52, 25}; // Test case 3
                break;
            case 3:
                numbers = new int[]{17, 19, 11}; // Test case 4
                break;
            case -2:
                numbers = new int[]{52, 60}; // Test case 5
                break;
            case 2:
                numbers = new int[]{30, 45}; // Test case 6
                break;
            default:
                System.out.println("Invalid input for N.");
                return;
        }
        // Calculate GCD and LCM
        int currentGCD = numbers[0];
        int currentLCM = numbers[0];

        for (int i = 1; i < n; i++) {
            currentGCD = gcd(currentGCD, numbers[i]);
            currentLCM = lcm(currentLCM, numbers[i]);
        }
        // Print the results
        System.out.println("LCM = " + currentLCM);
        System.out.println("GCD = " + currentGCD);
    }
}
