class Box {
    // Instance variables for dimensions of the box
    private double length;
    private double width;
    private double height;

    // Default constructor
    public Box() {
        // Setting default dimensions
        this.length = 5.0; // Default length
        this.width = 3.0;  // Default width
        this.height = 4.0; // Default height
    }

    // Method to calculate the volume of the box
    public double calculateVolume() {
        return length * width * height;
    }

    // Method to display the volume
    public void displayVolume() {
        System.out.println("The volume of the box is: " + calculateVolume() + " cubic units.");
    }
}

public class BoxVolume {
    public static void main(String[] args) {
        // Create a Box object using the default constructor
        Box box = new Box();
        // Display the volume of the box
        box.displayVolume();
    }
}
