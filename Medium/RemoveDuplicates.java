import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

    // Function to remove duplicates from array
    public static Integer[] removeDuplicates(int[] array) {
        // Use LinkedHashSet to maintain order and remove duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int value : array) {
            set.add(value); // Add elements to set (duplicates are automatically removed)
        }
        return set.toArray(new Integer[0]); // Convert set to array and return
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Remove duplicates
        Integer[] nonDuplicateArray = removeDuplicates(array);

        // Display result
        System.out.println("Non-duplicate items: " + Arrays.toString(nonDuplicateArray));
    }
}
