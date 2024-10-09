import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    
    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // Example Input: n = 3
        int n = 3;
        List<String> result = fizzBuzz(n);
        System.out.println(result);

        // Test cases:
        System.out.println(fizzBuzz(5));    // Test Case 1: n = 5
        System.out.println(fizzBuzz(10));   // Test Case 2: n = 10
        System.out.println(fizzBuzz(12));   // Test Case 3: n = 12
        System.out.println(fizzBuzz(18));   // Test Case 4: n = 18
        System.out.println(fizzBuzz(20));   // Test Case 5: n = 20
    }
}
