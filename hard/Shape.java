abstract class Shape {
    // Abstract methods to calculate area and volume
    abstract double calculateArea();
    abstract double calculateVolume();
}

class Sphere extends Shape {
    private double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Calculate area of the sphere
    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Calculate volume of the sphere
    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

class Cone extends Shape {
    private double radius;
    private double height;

    // Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Calculate area of the cone
    @Override
    double calculateArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    // Calculate volume of the cone
    @Override
    double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Calculate area of the cylinder
    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Calculate volume of the cylinder
    @Override
    double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Sphere, Cone, and Cylinder
        Shape sphere = new Sphere(5);
        Shape cone = new Cone(5, 10);
        Shape cylinder = new Cylinder(5, 10);

        // Display area and volume for Sphere
        System.out.println("Sphere:");
        System.out.println("Area: " + sphere.calculateArea());
        System.out.println("Volume: " + sphere.calculateVolume());

        // Display area and volume for Cone
        System.out.println("\nCone:");
        System.out.println("Area: " + cone.calculateArea());
        System.out.println("Volume: " + cone.calculateVolume());

        // Display area and volume for Cylinder
        System.out.println("\nCylinder:");
        System.out.println("Area: " + cylinder.calculateArea());
        System.out.println("Volume: " + cylinder.calculateVolume());
    }
}
