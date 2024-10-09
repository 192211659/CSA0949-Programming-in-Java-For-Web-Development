import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArrays {

    public static void main(String[] args) {
        // Input arrays
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};

        // Create an ArrayList to store the merged result
        ArrayList<Integer> mergedList = new ArrayList<>();

        // Add elements of arr1 to the ArrayList
        for (int num : arr1) {
            mergedList.add(num);
        }

        // Add elements of arr2 to the ArrayList
        for (int num : arr2) {
            mergedList.add(num);
        }

        // Sort the merged list (ArrayList)
        Collections.sort(mergedList);

        // Convert the merged list back to an array (if needed)
        int[] arr3 = mergedList.stream().mapToInt(Integer::intValue).toArray();

        // Output the merged and sorted array
        System.out.print("Merged and sorted array: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }
}
