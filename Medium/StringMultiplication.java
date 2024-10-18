public class StringMultiplication {

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";

        String product = multiplyStrings(num1, num2);
        System.out.println("Product: " + product);
    }

    public static String multiplyStrings(String num1, String num2) {
        // Handle the case of one or both numbers being "0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int len1 = num1.length();
        int len2 = num2.length();
        int[] product = new int[len1 + len2]; // Maximum possible length of the product

        // Reverse loop through both numbers
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); // Multiply digits
                int sum = mul + product[i + j + 1]; // Add to the current position

                product[i + j + 1] = sum % 10; // Store the unit place
                product[i + j] += sum / 10; // Carry over to the next position
            }
        }

        // Convert the product array to a string
        StringBuilder result = new StringBuilder();
        for (int num : product) {
            if (!(result.length() == 0 && num == 0)) { // Skip leading zeros
                result.append(num);
            }
        }

        return result.length() == 0 ? "0" : result.toString(); // Handle case of all zeros
    }
}
