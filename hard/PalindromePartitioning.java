public class PalindromePartitioning {

    // Function to check if a substring s[left...right] is a palindrome
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to find the minimum cuts needed for palindrome partitioning
    public static int minCuts(String s) {
        int n = s.length();
        if (n == 0) return 0;

        // Array to store the minimum cuts needed for substrings
        int[] cuts = new int[n];
        
        // Initialize cuts array
        for (int i = 0; i < n; i++) {
            cuts[i] = i; // Maximum cuts needed is i (for substrings of length i + 1)
        }

        for (int i = 0; i < n; i++) {
            // Check for odd-length palindromes centered at i
            for (int j = 0; j <= i; j++) {
                if (isPalindrome(s, j, i)) {
                    cuts[i] = (j == 0) ? 0 : Math.min(cuts[i], cuts[j - 1] + 1);
                }
            }
        }

        return cuts[n - 1];
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        String input = "aabbc";
        int result = minCuts(input);
        System.out.println("Minimum cuts needed for palindrome partitioning of \"" + input + "\": " + result);
    }
}
