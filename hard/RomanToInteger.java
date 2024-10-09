import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    
    public static int romanToInt(String s) {
        // Map to store Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Iterate through the string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.getOrDefault(currentChar, 0);

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            // Update previous value to current value for next iteration
            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        // Example Input: s = "III"
        String input1 = "III";
        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Output: " + romanToInt(input1)); // Output: 3

        // Test cases:
        System.out.println("Test Case 1: " + romanToInt("LVIII"));    // Output: 58
        System.out.println("Test Case 2: " + romanToInt("MCMXCI"));   // Output: 1991
        System.out.println("Test Case 3: " + romanToInt("V"));         // Output: 5
        System.out.println("Test Case 4: " + romanToInt("LZAII"));     // Output: 0 (invalid input)
        System.out.println("Test Case 5: " + romanToInt("MCCDTIV"));   // Output: 0 (invalid input)
    }
}
