import java.util.Scanner;
import java.util.Vector;

class Student {
    private String name;
    private int rollNumber;
    private String department;
    private String course;
    private String contactInfo;

    // Constructor
    public Student(String name, int rollNumber, String department, String course, String contactInfo) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        this.course = course;
        this.contactInfo = contactInfo;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getCourse() {
        return course;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    // Method to display student details
    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Department: " + department +
                ", Course: " + course + ", Contact Info: " + contactInfo;
    }
}

public class StudentManagement {
    private Vector<Student> studentRecords;

    public StudentManagement() {
        studentRecords = new Vector<>();
    }

    // Method to insert a student record
    public void insertStudent(Student student) {
        studentRecords.add(student);
        System.out.println("Student added successfully!");
    }

    // Method to retrieve a student record by roll number
    public void retrieveStudent(int rollNumber) {
        for (Student student : studentRecords) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    // Method to remove a student record by roll number
    public void removeStudent(int rollNumber) {
        for (int i = 0; i < studentRecords.size(); i++) {
            if (studentRecords.get(i).getRollNumber() == rollNumber) {
                studentRecords.remove(i);
                System.out.println("Student removed successfully!");
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement management = new StudentManagement();

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Insert Student");
            System.out.println("2. Retrieve Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    // Insert Student
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter Contact Information: ");
                    String contactInfo = scanner.nextLine();

                    Student student = new Student(name, rollNumber, department, course, contactInfo);
                    management.insertStudent(student);
                    break;

                case 2:
                    // Retrieve Student
                    System.out.print("Enter Roll Number to retrieve: ");
                    int retrieveRollNumber = scanner.nextInt();
                    management.retrieveStudent(retrieveRollNumber);
                    break;

                case 3:
                    // Remove Student
                    System.out.print("Enter Roll Number to remove: ");
                    int removeRollNumber = scanner.nextInt();
                    management.removeStudent(removeRollNumber);
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
