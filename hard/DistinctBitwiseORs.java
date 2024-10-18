import java.util.HashSet;
import java.util.Set;

public class DistinctBitwiseORs {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int result = countDistinctBitwiseORs(arr);
        System.out.println(result); // Output: 3
    }

    public static int countDistinctBitwiseORs(int[] arr) {
        Set<Integer> distinctORs = new HashSet<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int currentOR = 0;

            // Calculate the OR for all subarrays starting at index i
            for (int j = i; j < n; j++) {
                currentOR |= arr[j]; // Update current OR
                distinctORs.add(currentOR); // Add the current OR to the set
            }
        }

        return distinctORs.size(); // Return the count of distinct ORs
    }
}
