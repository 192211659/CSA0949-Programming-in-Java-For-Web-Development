import java.util.Arrays;
import java.util.Scanner;

public class NthLargestNumber {

    // Function to find the Nth largest number in an array
    public static int findNthLargest(int[] array, int N) {
        // Sort the array in descending order
        Arrays.sort(array);
        
        if (N <= 0 || N > array.length) {
            throw new IllegalArgumentException("N is out of bounds.");
        }
        
        // Return the Nth largest (Nth from the end of the sorted array)
        return array[array.length - N];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Sample array
        int[] array = {14, 67, 48, 23, 5, 62};
        
        System.out.println("List: " + Arrays.toString(array));
        System.out.print("Enter the value of N: ");
        
        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }

        int N = sc.nextInt();

        try {
            int nthLargest = findNthLargest(array, N);
            System.out.println(N + "th Largest number: " + nthLargest);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
