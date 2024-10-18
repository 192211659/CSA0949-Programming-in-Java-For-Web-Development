import java.util.ArrayList;
import java.util.List;

public class BaseNeg2Addition {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1};
        int[] arr2 = {1, 0, 1};
        int[] result = addBaseNeg2(arr1, arr2);
        
        // Print result
        for (int num : result) {
            System.out.print(num);
        }
    }

    public static int[] addBaseNeg2(int[] arr1, int[] arr2) {
        // Convert arr1 and arr2 to decimal
        int num1 = convertToDecimal(arr1);
        int num2 = convertToDecimal(arr2);
        
        // Add the two decimal numbers
        int sum = num1 + num2;
        
        // Convert the sum back to base -2
        return convertToBaseNeg2(sum);
    }

    private static int convertToDecimal(int[] arr) {
        int result = 0;
        int power = 1; // This represents (-2)^0 initially

        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i] * power;
            power *= -2; // Move to the next power of -2
        }

        return result;
    }

    private static int[] convertToBaseNeg2(int sum) {
        if (sum == 0) {
            return new int[]{0}; // Edge case for 0
        }

        List<Integer> result = new ArrayList<>();

        while (sum != 0) {
            int remainder = sum % -2; // Get the remainder in base -2
            sum /= -2; // Divide by -2

            // Adjust for negative remainder
            if (remainder < 0) {
                remainder += 2;
                sum++;
            }

            result.add(remainder); // Append the remainder
        }

        // Reverse the list to get the correct order
        int[] arrResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arrResult[i] = result.get(result.size() - 1 - i);
        }

        return arrResult;
    }
}
