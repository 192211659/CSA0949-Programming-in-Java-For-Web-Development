import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        // Create a frequency map for characters in the magazine
        Map<Character, Integer> magazineMap = new HashMap<>();
        
        // Count the frequency of each letter in the magazine
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        // Check if the ransom note can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            }
            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        // Example Input
        System.out.println(canConstruct("a", "b")); // Output: false

        // Test cases
        System.out.println(canConstruct("aa", "ab"));   // Output: false
        System.out.println(canConstruct("aa", "aab"));  // Output: true
        System.out.println(canConstruct("abc", "abc")); // Output: true
        System.out.println(canConstruct("good", "better")); // Output: false
        System.out.println(canConstruct("xyz", "123"));  // Output: false
    }
}
