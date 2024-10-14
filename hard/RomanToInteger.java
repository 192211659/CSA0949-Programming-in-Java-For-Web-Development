import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        // Map of Roman numerals and their corresponding integer values
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

        // Loop through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.getOrDefault(s.charAt(i), -1);
            if (currValue == -1) {
                System.out.println("Invalid Roman numeral: " + s);
                return -1; // Return -1 for invalid Roman numerals (as seen in test case 4, 5)
            }

            // If the current value is less than the previous value, subtract it, otherwise add it
            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue;
            }
            prevValue = currValue;
        }

        return total;
    }

    public static void main(String[] args) {
        // Example Input
        System.out.println(romanToInt("III")); // Output: 3

        // Test cases
        System.out.println(romanToInt("LVIII"));   // Output: 58
        System.out.println(romanToInt("MCMXCI"));  // Output: 1991
        System.out.println(romanToInt("V"));       // Output: 5
        System.out.println(romanToInt("LZAII"));   // Output: -1 (Invalid Roman numeral)
        System.out.println(romanToInt("MCCDTIV")); // Output: -1 (Invalid Roman numeral)
    }
}
