import java.util.Scanner;

// Base class for Student
class Student {
    int[] marks = new int[6];
    String[] subjects = {"Python", "C Programming", "Mathematics", "Physics", "Chemistry", "Professional Ethics"};
    int totalMarks = 0;
    double aggregate = 0;

    // Method to input marks
    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the marks in " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    // Method to calculate total and aggregate
    public void calculateTotalAndAggregate() {
        for (int mark : marks) {
            totalMarks += mark;
        }
        aggregate = totalMarks / 6.0;  // Aggregate is average of all marks
    }
}

// Derived class for Grading
class Grading extends Student {
    
    // Method to display total, aggregate, and grade
    public void displayResult() {
        System.out.println("Total = " + totalMarks);
        System.out.printf("Aggregate = %.2f\n", aggregate);

        // Determine and display grade
        if (aggregate > 75) {
            System.out.println("Class: DISTINCTION");
        } else if (aggregate > 60) {
            System.out.println("Class: FIRST DIVISION");
        } else if (aggregate > 50) {
            System.out.println("Class: SECOND DIVISION");
        } else if (aggregate > 40) {
            System.out.println("Class: THIRD DIVISION");
        } else {
            System.out.println("Class: FAIL");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object of derived class Grading
        Grading student = new Grading();

        // Input marks, calculate total, aggregate, and display result
        student.inputMarks();
        student.calculateTotalAndAggregate();
        student.displayResult();
    }
}
