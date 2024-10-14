// Superclass Vehicle
class Vehicle {
    private String licensePlate;
    private String owner;

    // Constructor
    public Vehicle(String licensePlate, String owner) {
        this.licensePlate = licensePlate;
        this.owner = owner;
    }

    // Getters
    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwner() {
        return owner;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Owner: " + owner);
    }
}

// Subclass Car
class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String licensePlate, String owner, int numberOfDoors) {
        super(licensePlate, owner);
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display car details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Car");
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Subclass Truck
class Truck extends Vehicle {
    private double loadCapacity;

    // Constructor
    public Truck(String licensePlate, String owner, double loadCapacity) {
        super(licensePlate, owner);
        this.loadCapacity = loadCapacity;
    }

    // Method to display truck details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Truck");
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String licensePlate, String owner, boolean hasSidecar) {
        super(licensePlate, owner);
        this.hasSidecar = hasSidecar;
    }

    // Method to display motorcycle details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Motorcycle");
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects for each subclass
        Car car = new Car("ABC123", "Alice", 4);
        Truck truck = new Truck("XYZ789", "Bob", 10);
        Motorcycle motorcycle = new Motorcycle("MNO456", "Charlie", false);

        // Displaying details for each vehicle
        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println();

        System.out.println("Truck Details:");
        truck.displayDetails();
        System.out.println();

        System.out.println("Motorcycle Details:");
        motorcycle.displayDetails();
    }
}
