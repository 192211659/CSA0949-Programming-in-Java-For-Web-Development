class Student {
    // Attributes
    private String name;
    private String registerNumber;
    private int[] marks = new int[5]; // Array to store marks of 5 subjects
    private int total;
    private double average;

    // Constructor
    public Student(String name, String registerNumber, int[] marks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.marks = marks;
        calculateTotalAndAverage();
    }

    // Method to calculate total and average
    private void calculateTotalAndAverage() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / 5.0; // Calculate average
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Marks: %.2f%n", average);
    }
}

public class Main {
    public static void main(String[] args) {
        // Example marks for 5 subjects
        int[] marks = {85, 90, 78, 88, 92};

        // Create a Student object
        Student student = new Student("John Doe", "REG12345", marks);

        // Display student details
        student.displayDetails();
    }
}
