import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    public static void main(String[] args) {
        String num1 = "1101111";
        String num2 = "112358130";
        String num3 = "0123";

        System.out.println(splitIntoFibonacci(num1)); // Output: [11, 0, 11, 11] or similar
        System.out.println(splitIntoFibonacci(num2)); // Output: []
        System.out.println(splitIntoFibonacci(num3)); // Output: []
    }

    public static List<Integer> splitIntoFibonacci(String num) {
        List<Integer> result = new ArrayList<>();
        backtrack(num, 0, result);
        return result;
    }

    private static boolean backtrack(String num, int start, List<Integer> result) {
        int n = num.length();

        // We need at least 3 numbers to form a Fibonacci-like sequence
        if (result.size() >= 3 && start == n) {
            return true;
        }

        for (int length = 1; length <= n - start; length++) {
            String substring = num.substring(start, start + length);
            if (isInvalid(substring)) continue;

            int number = Integer.parseInt(substring);
            if (number >= (1 << 31)) continue; // Exceeds 32-bit signed integer

            // If we have at least 2 numbers, check the Fibonacci condition
            if (result.size() >= 2) {
                int sum = result.get(result.size() - 1) + result.get(result.size() - 2);
                if (sum < number) continue; // The sum should be equal or smaller
                if (sum > number) break; // Further numbers will only be larger
            }

            // Add the current number and proceed with the next part of the string
            result.add(number);
            if (backtrack(num, start + length, result)) {
                return true;
            }
            // Backtrack
            result.remove(result.size() - 1);
        }

        return false;
    }

    private static boolean isInvalid(String s) {
        // Invalid if it has leading zeros and is not "0"
        return s.length() > 1 && s.charAt(0) == '0';
    }
}
