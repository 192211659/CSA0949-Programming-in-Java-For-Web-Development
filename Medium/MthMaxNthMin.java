import java.util.Arrays;
import java.util.Scanner;

public class MthMaxNthMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.print("Enter the array of elements separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];

        // Convert input to integer array
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        // Get M and N values
        System.out.print("Enter the value of M (for Mth maximum): ");
        int M = scanner.nextInt();
        System.out.print("Enter the value of N (for Nth minimum): ");
        int N = scanner.nextInt();

        // Sort the array
        Arrays.sort(array);

        // Check for valid M and N
        if (M <= 0 || N <= 0 || M > array.length || N > array.length) {
            System.out.println("Invalid M or N values.");
        } else {
            // Mth maximum is the (length - M)th element in the sorted array
            int mthMax = array[array.length - M];

            // Nth minimum is the (N-1)th element in the sorted array
            int nthMin = array[N - 1];

            // Calculate sum and difference
            int sum = mthMax + nthMin;
            int difference = mthMax - nthMin;

            // Output the results
            System.out.println(M + "th Maximum Number = " + mthMax);
            System.out.println(N + "th Minimum Number = " + nthMin);
            System.out.println("Sum = " + sum);
            System.out.println("Difference = " + difference);
        }

        scanner.close();
    }
}
