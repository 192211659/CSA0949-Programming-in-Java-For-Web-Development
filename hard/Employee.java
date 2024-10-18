class Employee {
    protected String name;
    protected double basicSalary;

    // Constructor
    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to get salary
    public double getSalary() {
        return basicSalary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {
    private double travelingAllowance;
    private double houseRentAllowance;

    // Constructor
    public Manager(String name, double basicSalary, double travelingAllowance, double houseRentAllowance) {
        super(name, basicSalary);
        this.travelingAllowance = travelingAllowance;
        this.houseRentAllowance = houseRentAllowance;
    }

    // Override getSalary method
    @Override
    public double getSalary() {
        return basicSalary + travelingAllowance + houseRentAllowance;
    }

    // Method to display manager details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Traveling Allowance: " + travelingAllowance);
        System.out.println("House Rent Allowance: " + houseRentAllowance);
        System.out.println("Total Salary: " + getSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Employee
        Employee employee = new Employee("John Doe", 50000);
        System.out.println("Employee Details:");
        employee.displayDetails();
        System.out.println("Total Salary: " + employee.getSalary());

        System.out.println();

        // Creating a Manager
        Manager manager = new Manager("Jane Smith", 70000, 15000, 10000);
        System.out.println("Manager Details:");
        manager.displayDetails();
    }
}
