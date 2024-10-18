import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double salary;
    private double pf;
    private double allowance;

    // Constructor
    public Employee(String name, int id, double salary, double pf, double allowance) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.pf = pf;
        this.allowance = allowance;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public double getPf() {
        return pf;
    }

    public double getAllowance() {
        return allowance;
    }

    // Method to display employee details
    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary +
               ", PF: " + pf + ", Allowance: " + allowance;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Retrieve Employees");
            System.out.println("3. Remove Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    // Add Employee
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    System.out.print("Enter Employee PF: ");
                    double pf = scanner.nextDouble();
                    System.out.print("Enter Employee Allowance: ");
                    double allowance = scanner.nextDouble();
                    employees.add(new Employee(name, id, salary, pf, allowance));
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    // Retrieve Employees
                    System.out.println("Employee List:");
                    for (Employee emp : employees) {
                        System.out.println(emp);
                    }
                    break;

                case 3:
                    // Remove Employee
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < employees.size(); i++) {
                        if (employees.get(i).getId() == removeId) {
                            employees.remove(i);
                            System.out.println("Employee removed successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
