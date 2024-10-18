public class HollowSquarePattern {
    public static void main(String[] args) {
        int size = 5; // Size of the square

        // Loop through each row
        for (int i = 0; i < size; i++) {
            // Loop through each column
            for (int j = 0; j < size; j++) {
                // Print '$' at the borders (first row, last row, first column, last column)
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("$ ");
                } else {
                    // Print space inside the hollow square
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
