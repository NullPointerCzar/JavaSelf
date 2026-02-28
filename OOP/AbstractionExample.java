package OOP;

/*
 * ABSTRACTION
 * OOP Concept: Abstraction - hiding complex implementation details, showing only essential features
 * This example demonstrates:
 * - Abstract class (Shape) - cannot be instantiated directly
 * - Abstract methods (getArea, getPerimeter) - must be implemented by subclasses
 * - Concrete subclasses (Circle, Rectangle) - provide specific implementations
 * - Abstraction forces subclasses to implement required behavior
 */

/*
Subclasses must implement the inherited abstract methods mandatorily
*/

abstract class Shape {
    // Abstract methods - no implementation, must be overridden by subclasses
    abstract double getArea();

    abstract double getPerimeter();

    void display() {
        System.out.println("This is a shape");
    }
}

// Concrete Circle class implements abstract methods
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Circle-specific implementation of getArea()
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double side1, side2, side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rect = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Circle - Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle - Area: " + rect.getArea() + ", Perimeter: " + rect.getPerimeter());
        System.out.println("Triangle - Area: " + triangle.getArea() + ", Perimeter: " + triangle.getPerimeter());
    }
}
