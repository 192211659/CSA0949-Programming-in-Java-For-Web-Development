import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Sample input for demonstration
        int[] numbers = {10, 20, 30}; // Sample array for ArrayIndexOutOfBoundsException
        String[] strings = null; // This will trigger NullPointerException
        
        // Demonstrating ArithmeticException
        try {
            System.out.print("Enter a number to divide 100: ");
            int divisor = scanner.nextInt();
            int result = 100 / divisor; // May throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        }

        // Demonstrating ArrayIndexOutOfBoundsException
        try {
            System.out.print("Enter an index to access the numbers array (0 to 2): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]); // May throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: Invalid index.");
        }

        // Demonstrating NullPointerException
        try {
            System.out.println("Attempting to access a null array:");
            System.out.println("Length of strings array: " + strings.length); // May throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: Cannot access properties of a null object.");
        }

        // Multi-catch demonstration
        try {
            System.out.print("Enter an index to access the numbers array (0 to 2): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
            System.out.println("Length of strings array: " + strings.length); // Will throw NullPointerException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        scanner.close();
    }
}
