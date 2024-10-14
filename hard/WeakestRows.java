import java.util.Arrays;
import java.util.PriorityQueue;

public class WeakestRows {

    public static int[] kWeakestRows(int[][] mat, int k) {
        // Create a priority queue to store rows based on the number of soldiers and row index
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])
        );

        // Loop through each row, count the soldiers, and add to the priority queue
        for (int i = 0; i < mat.length; i++) {
            int soldierCount = countSoldiers(mat[i]);
            pq.offer(new int[]{soldierCount, i});  // {soldierCount, rowIndex}
        }

        // Extract the indices of the k weakest rows
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[1];  // Get the row index
        }

        return result;
    }

    // Helper method to count the number of soldiers (1s) in a row
    private static int countSoldiers(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) {
                count++;
            } else {
                break;  // Soldiers are always to the left, so stop when 0 is encountered
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example 1
        int[][] mat1 = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };
        int k1 = 3;
        System.out.println(Arrays.toString(kWeakestRows(mat1, k1))); // Output: [2, 0, 3]

        // Example 2
        int[][] mat2 = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 0},
            {1, 0, 0, 0}
        };
        int k2 = 2;
        System.out.println(Arrays.toString(kWeakestRows(mat2, k2))); // Output: [0, 2]
    }
}
