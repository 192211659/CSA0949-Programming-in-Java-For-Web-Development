class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee();

        // Set employee details using setter methods
        employee.setId(101);
        employee.setName("Alice Smith");
        employee.setDepartment("Human Resources");
        employee.setSalary(75000.00);

        // Display employee details using displayDetails method
        System.out.println("Employee Details:");
        employee.displayDetails();
    }
}
