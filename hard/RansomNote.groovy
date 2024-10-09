import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    
    public static boolean canConstruct(String ransomNote, String magazine) {
        // Create a map to count the frequency of each letter in magazine
        Map<Character, Integer> letterCount = new HashMap<>();

        // Count the frequency of each letter in the magazine
        for (char c : magazine.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }

        // Check if ransomNote can be constructed from magazine
        for (char c : ransomNote.toCharArray()) {
            if (letterCount.getOrDefault(c, 0) == 0) {
                return false; // Not enough letters in magazine
            }
            letterCount.put(c, letterCount.get(c) - 1); // Use the letter
        }

        return true; // Ransom note can be constructed
    }

    public static void main(String[] args) {
        // Example Input
        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println("Input: ransomNote = \"" + ransomNote1 + "\", magazine = \"" + magazine1 + "\"");
        System.out.println("Output: " + canConstruct(ransomNote1, magazine1)); // Output: false

        // Test cases
        System.out.println("Test Case 1: " + canConstruct("aa", "ab"));         // Output: false
        System.out.println("Test Case 2: " + canConstruct("aa", "aab"));        // Output: true
        System.out.println("Test Case 3: " + canConstruct("abc", "abc"));       // Output: true
        System.out.println("Test Case 4: " + canConstruct("good", "better"));   // Output: false
        System.out.println("Test Case 5: " + canConstruct("xyz", "123"));       // Output: false
    }
}
