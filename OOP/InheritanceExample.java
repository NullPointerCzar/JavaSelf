package OOP;

/*
 * INHERITANCE
 * OOP Concept: Inheritance - allows a child class to inherit properties and methods from parent class
 * This example demonstrates:
 * - Parent class (Animal) with common attributes and methods
 * - Child class (Dog) extending parent using 'extends' keyword
 * - Method Overriding - Dog overrides eat() method to provide specific behavior
 * - IS-A relationship - Dog IS-A Animal
 */
class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
    
    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    
    // Method overriding
    @Override
    void eat() {
        System.out.println(name + " is eating dog food");
    }
    
    void bark() {
        System.out.println(name + " is barking: Woof!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.bark();
    }
}
