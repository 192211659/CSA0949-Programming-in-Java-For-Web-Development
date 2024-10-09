public class LastWordLength {
    
    public static int lengthOfLastWord(String s) {
        // Trim any trailing spaces from the string
        s = s.trim();
        
        // Find the last space in the trimmed string
        int lastSpaceIndex = s.lastIndexOf(' ');

        // If there is no space, the last word is the entire string
        if (lastSpaceIndex == -1) {
            return s.length();
        }

        // The length of the last word is the difference between the total length and the last space index
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        // Example Input: s = "Hello World"
        String input1 = "Hello World";
        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Output: " + lengthOfLastWord(input1)); // Output: 5

        // Test cases:
        System.out.println("Test Case 1: " + lengthOfLastWord("Maximal Substring Consisting")); // Output: 10
        System.out.println("Test Case 2: " + lengthOfLastWord("lea@st one wor2d")); // Output: 4
        System.out.println("Test Case 3: " + lengthOfLastWord("1254  98076")); // Output: 5
        System.out.println("Test Case 4: " + lengthOfLastWord("& * (  ) % # $")); // Output: 1
        System.out.println("Test Case 5: " + lengthOfLastWord("letters and spaces")); // Output: 6
    }
}
