import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {
    
    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        List<Integer> commonElements = new ArrayList<>();

        // Add all elements of the first array to a set
        for (int num : array1) {
            if (num > 0) { // Ensure only positive integers are considered
                set1.add(num);
            }
        }

        // Check common elements in the second array
        for (int num : array2) {
            if (num > 0 && set1.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;
    }

    public static void main(String[] args) {
        // Sample Input
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 4, 5, 6, 7};
        System.out.println(findCommonElements(array1, array2)); // Expected Output: [2, 4]

        // Test cases
        int[] test1Array1 = {1, 2, 3, 4};
        int[] test1Array2 = {4, 5, 6, 7, 8};
        System.out.println(findCommonElements(test1Array1, test1Array2)); // Output: [4]

        // Non-integer inputs or negative numbers are not handled here as per the problem statement.
        // Therefore, case 2, 3, 4, and 5 would need adjustments (e.g., type checkers) if expected to run.
    }
}
