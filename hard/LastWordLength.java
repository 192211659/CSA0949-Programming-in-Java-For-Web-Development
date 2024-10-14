public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        // Trim the string to remove trailing spaces
        s = s.trim();

        // Find the index of the last space in the string
        int lastSpaceIndex = s.lastIndexOf(" ");

        // The length of the last word is the length of the string minus the last space index - 1
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        // Example 1
        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1)); // Output: 5

        // Test cases
        String test1 = "Maximal Substring Consisting";
        String test2 = "lea@st one wor2d";
        String test3 = "1254  98076";
        String test4 = "& * (  ) % # $";
        String test5 = "letters and spaces";

        System.out.println(lengthOfLastWord(test1)); // Output: 10 ("Consisting")
        System.out.println(lengthOfLastWord(test2)); // Output: 5 ("wor2d")
        System.out.println(lengthOfLastWord(test3)); // Output: 5 ("98076")
        System.out.println(lengthOfLastWord(test4)); // Output: 1 ("$")
        System.out.println(lengthOfLastWord(test5)); // Output: 6 ("spaces")
    }
}
