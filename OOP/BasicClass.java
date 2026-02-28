package OOP;

/*
 * ENCAPSULATION & CLASS BASICS
 * OOP Concept: Encapsulation - bundling data (variables) and behavior (methods) together
 * This example demonstrates:
 * - Creating a class with attributes (name, age)
 * - Constructor for initialization
 * - Methods for behavior
 * - Object creation and method invocation
 */
class Person {
    String name;
    int age;
    
    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class BasicClass {
    public static void main(String[] args) {
        // Object creation - Each object (p1, p2) has its own state (name, age)
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);
        
        // Method invocation - behavior of the class
        p1.display();
        p2.display();
    }
}
