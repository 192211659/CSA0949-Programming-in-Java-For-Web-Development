class Date {
    private int day;
    private int month;
    private int year;

    // Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Method to return date as a string
    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

class Student {
    private int id;
    private String name;
    private Date dateOfBirth;
    private int[] marks;

    // Constructor
    public Student(int id, String name, Date dateOfBirth, int[] marks) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        Date dob = new Date(15, 5, 2000);
        int[] marks = {85, 90, 78};
        Student student = new Student(1, "John Doe", dob, marks);
        
        // Display student details
        student.displayDetails();
    }
}
