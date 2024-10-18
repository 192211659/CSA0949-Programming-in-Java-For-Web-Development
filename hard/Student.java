package marks;

public class Student {
    private String name;
    private int rollNumber;
    private double[] marks;
    private int numberOfSubjects;

    // Parameterized constructor
    public Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.numberOfSubjects = marks.length;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    // Method to calculate total marks
    public double calculateTotal() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        double total = calculateTotal();
        return (total / (numberOfSubjects * 100)) * 100; // Assuming each subject is out of 100
    }
}
