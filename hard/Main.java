import java.util.HashMap;
import java.util.Map;

class WordFilter {
    private Map<String, Integer> prefixSuffixMap;

    public WordFilter(String[] words) {
        prefixSuffixMap = new HashMap<>();

        // Populate the map with all possible prefix and suffix combinations
        for (int index = 0; index < words.length; index++) {
            String word = words[index];
            for (int i = 0; i <= word.length(); i++) {
                for (int j = 0; j <= word.length(); j++) {
                    String prefix = word.substring(0, i); // prefix of length i
                    String suffix = word.substring(word.length() - j); // suffix of length j
                    // Store the index for the combination of prefix and suffix
                    prefixSuffixMap.put(prefix + "|" + suffix, index);
                }
            }
        }
    }

    public int f(String pref, String suff) {
        // Look up the combination of prefix and suffix in the map
        return prefixSuffixMap.getOrDefault(pref + "|" + suff, -1);
    }
}

public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "app", "apricot", "bat"};
        WordFilter wordFilter = new WordFilter(words);

        // Test cases
        System.out.println(wordFilter.f("a", "e")); // Output: 0 (word "apple")
        System.out.println(wordFilter.f("b", "a")); // Output: 1 (word "banana")
        System.out.println(wordFilter.f("ap", "p")); // Output: 2 (word "app")
        System.out.println(wordFilter.f("ap", "t")); // Output: -1 (no word)
        System.out.println(wordFilter.f("b", "t")); // Output: 4 (word "bat")
    }
}
