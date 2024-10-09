import java.util.ArrayList;
import java.util.Scanner;

public class NumberSquareArray {

    // Function to generate number and square pairs
    public static ArrayList<String> generateNumberSquarePairs(int lowerRange, int upperRange) {
        ArrayList<String> result = new ArrayList<>();

        // If lowerRange is greater than upperRange, print an error message and return empty list
        if (lowerRange > upperRange) {
            System.out.println("Error: Lower range cannot be greater than upper range.");
            return result;
        }

        // Loop through the range and add pairs to the list
        for (int i = lowerRange; i <= upperRange; i++) {
            result.add("(" + i + ", " + (i * i) + ")");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the lower and upper range from the user
        System.out.print("Enter the lower range: ");
        int lowerRange = sc.nextInt();

        System.out.print("Enter the upper range: ");
        int upperRange = sc.nextInt();

        // Generate the number-square pairs
        ArrayList<String> numberSquarePairs = generateNumberSquarePairs(lowerRange, upperRange);

        // Display the result
        if (!numberSquarePairs.isEmpty()) {
            System.out.println(numberSquarePairs);
        }
    }
}
