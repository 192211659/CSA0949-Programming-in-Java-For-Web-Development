import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MeanMedianMode {

    // Function to calculate the mean
    public static double calculateMean(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    // Function to calculate the median
    public static double calculateMedian(double[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        if (length % 2 == 0) {
            return (arr[length / 2 - 1] + arr[length / 2]) / 2;
        } else {
            return arr[length / 2];
        }
    }

    // Function to calculate the mode
    public static double calculateMode(double[] arr) {
        HashMap<Double, Integer> frequencyMap = new HashMap<>();

        for (double num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        double mode = arr[0];
        int maxCount = 0;

        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        // Example array
        double[] arr = {16, 18, 27, 16, 23, 21, 19};

        // Calculate Mean, Median, Mode
        double mean = calculateMean(arr);
        double median = calculateMedian(arr);
        double mode = calculateMode(arr);

        // Output results
        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode);
    }
}
