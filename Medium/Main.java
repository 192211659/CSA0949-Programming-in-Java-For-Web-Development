// Parent class
class Parent {
    public void printMessage() {
        System.out.println("This is parent class");
    }
}

// Child class that extends Parent
class Child extends Parent {
    public void printChildMessage() {
        System.out.println("This is child class");
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Create an object of Parent class and call its method
        Parent parent = new Parent();
        parent.printMessage();

        // 2. Create an object of Child class and call its method
        Child child = new Child();
        child.printChildMessage();

        // 3. Call method of Parent class by object of Child class
        child.printMessage();
    }
}
