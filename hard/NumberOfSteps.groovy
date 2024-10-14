public class NumberOfSteps {

    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;  // If the number is even, divide by 2
            } else {
                num -= 1;  // If the number is odd, subtract 1
            }
            steps++;  // Increment step count
        }
        return steps;
    }

    public static void main(String[] args) {
        // Example Input
        System.out.println(numberOfSteps(14)); // Output: 6

        // Test Cases
        System.out.println(numberOfSteps(5));   // Output: 4
        System.out.println(numberOfSteps(10));  // Output: 5
        System.out.println(numberOfSteps(12));  // Output: 5
        System.out.println(numberOfSteps(18));  // Output: 6
        System.out.println(numberOfSteps(20));  // Output: 6
    }
}
