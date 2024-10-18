public class InvertedPyramidPattern {
    public static void main(String[] args) {
        int rows = 3; // Number of rows

        // Outer loop for each row
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars (inverted pyramid)
            for (int k = 0; k < (2 * (rows - i) - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
