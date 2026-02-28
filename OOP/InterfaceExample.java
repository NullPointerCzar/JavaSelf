package OOP;

/*
 * POLYMORPHISM via INTERFACES
 * OOP Concept: Polymorphism - objects of different types can respond to same interface
 * This example demonstrates:
 * - Interface (Vehicle) - defines contract/behavior that must be implemented
 * - Multiple implementations (Car, Bike) - implement Vehicle interface
 * - Loose coupling - depends on interface, not concrete class
 * - Runtime polymorphism - same method call, different behavior
 */
interface Vehicle {
    // Interface methods - define contract that all implementations must follow
    void start();

    void stop();

    void drive();
}

// Car implements Vehicle interface
// Car implements Vehicle interface - must provide implementation for all
// methods
class Car implements Vehicle {
    // Car-specific implementation of interface methods
    @Override
    public void start() {
        System.out.println("Car engine started");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving on road");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike engine started");
    }

    @Override
    public void stop() {
        System.out.println("Bike engine stopped");
    }

    @Override
    public void drive() {
        System.out.println("Bike is driving on road");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Polymorphism: Using interface type, not concrete class
        // Car and Bike objects treated as Vehicle types
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("=== Car ===");
        car.start();
        car.drive();
        car.stop();

        System.out.println("\n=== Bike ===");
        bike.start();
        bike.drive();
        bike.stop();
    }
}
