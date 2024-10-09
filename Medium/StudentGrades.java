import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input marks for four subjects
        System.out.print("Enter the marks in Python: ");
        double pythonMarks = sc.nextDouble();
        
        System.out.print("Enter the marks in C Programming: ");
        double cProgrammingMarks = sc.nextDouble();
        
        System.out.print("Enter the marks in Mathematics: ");
        double mathMarks = sc.nextDouble();
        
        System.out.print("Enter the marks in Physics: ");
        double physicsMarks = sc.nextDouble();

        // Validate marks to ensure they are between 0 and 100
        if (pythonMarks < 0 || pythonMarks > 100 || cProgrammingMarks < 0 || cProgrammingMarks > 100 ||
            mathMarks < 0 || mathMarks > 100 || physicsMarks < 0 || physicsMarks > 100) {
            System.out.println("Error: Marks should be between 0 and 100.");
            return;
        }

        // Calculate total and aggregate
        double total = pythonMarks + cProgrammingMarks + mathMarks + physicsMarks;
        double aggregate = total / 4.0;

        // Display total and aggregate
        System.out.println("Total = " + total);
        System.out.println("Aggregate = " + aggregate);

        // Determine and display grade based on aggregate
        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60 && aggregate <= 75) {
            System.out.println("FIRST DIVISION");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("SECOND DIVISION");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("THIRD DIVISION");
        } else {
            System.out.println("FAIL");
        }
    }
}
