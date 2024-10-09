import java.util.Scanner;

public class EmployeeBonus {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the employee grade
        System.out.print("Enter the grade of the employee (A/B): ");
        String grade = sc.nextLine().toUpperCase();

        // Input the employee salary
        System.out.print("Enter the employee salary: ");
        double salary = sc.nextDouble();

        // Validate the input
        if (salary < 0) {
            System.out.println("Error: Salary cannot be negative.");
            return;
        }

        if (!grade.equals("A") && !grade.equals("B")) {
            System.out.println("Error: Invalid grade. Only A or B are allowed.");
            return;
        }

        double bonus = 0;

        // Calculate the bonus based on the grade
        if (grade.equals("A")) {
            bonus = 0.05 * salary; // 5% bonus for grade A
        } else if (grade.equals("B")) {
            bonus = 0.10 * salary; // 10% bonus for grade B
        }

        // Additional 2% bonus if salary is less than $10,000
        if (salary < 10000) {
            bonus += 0.02 * salary;
        }

        // Calculate total salary
        double totalSalary = salary + bonus;

        // Output the results
        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total to be paid = " + totalSalary);
    }
}
