public class ThreeEqualParts {
    public static int[] threeEqualParts(int[] arr) {
        int totalOnes = 0;
        
        // Step 1: Count total number of 1's in the array
        for (int num : arr) {
            if (num == 1) {
                totalOnes++;
            }
        }

        // If totalOnes is not divisible by 3, return [-1, -1]
        if (totalOnes % 3 != 0) {
            return new int[]{-1, -1};
        }

        // If there are no 1's, return [0, arr.length - 1] since all parts are zero
        if (totalOnes == 0) {
            return new int[]{0, arr.length - 1};
        }

        // Step 2: Identify the positions of 1's
        int onesPerPart = totalOnes / 3;
        int firstIndex = 0, secondIndex = 0, thirdIndex = 0;
        int count = 0;

        // Find the start indices of each part
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count == 1) firstIndex = i;
                else if (count == onesPerPart + 1) secondIndex = i;
                else if (count == 2 * onesPerPart + 1) thirdIndex = i;
            }
        }

        // Step 3: Compare the three parts
        // Compare the parts starting from firstIndex, secondIndex, and thirdIndex
        while (thirdIndex < arr.length && arr[firstIndex] == arr[secondIndex] && arr[secondIndex] == arr[thirdIndex]) {
            firstIndex++;
            secondIndex++;
            thirdIndex++;
        }

        // If we've exhausted the three parts, return the indices
        if (thirdIndex == arr.length) {
            return new int[]{firstIndex - 1, secondIndex};
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        int[] result = threeEqualParts(arr);
        System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
    }
}
