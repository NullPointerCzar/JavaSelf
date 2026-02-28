package OOP;

/*
 * STATIC & FINAL MODIFIERS
 * OOP Concept: Control over variable scope and mutability
 * This example demonstrates:
 * - Static variables - shared across all objects of the class
 * - Static methods - operate on class level, not instance level
 * - Final variables - cannot be modified after initialization (immutable)
 * - Final classes - cannot be extended/inherited
 */
class Counter {
    // Static variable - shared by all Counter objects, not per-instance
    static int count = 0;
    // Final variable - must be initialized and cannot be changed once assigned
    final String id;
    
    Counter(String id) {
        this.id = id;
        count++;
    }
    
    // Static method - called on class, not instance; can only access static variables
    static void showCount() {
        System.out.println("Total objects created: " + count);
    }
    
    void display() {
        System.out.println("Counter ID: " + id);
    }
}

// Final class - cannot be subclassed or extended, ensures immutability
final class ImmutableClass {
    private final int value;
    
    ImmutableClass(int value) {
        this.value = value;
    }
    
    int getValue() {
        return value;
    }
}

public class StaticAndFinalExample {
    public static void main(String[] args) {
        Counter c1 = new Counter("C1");
        Counter c2 = new Counter("C2");
        Counter c3 = new Counter("C3");
        
        c1.display();
        c2.display();
        c3.display();
        
        Counter.showCount();  // Static method
        
        System.out.println("\n=== Final Class ===");
        ImmutableClass obj = new ImmutableClass(42);
        System.out.println("Immutable value: " + obj.getValue());
    }
}
