package OOP;

/*
 * POLYMORPHISM
 * OOP Concept: Polymorphism - same name, different behavior
 * Types:
 * 1. Compile-time Polymorphism (Method Overloading)
 * 2. Runtime Polymorphism (Method Overriding)
 * This example demonstrates both types.
 */

// METHOD OVERLOADING - Compile-time Polymorphism
class Calculator {
    // Method Overloading - same method name 'add', different parameter types/counts
    // Compiler decides which method to call based on arguments (compile-time)
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// METHOD OVERRIDING - Runtime Polymorphism
class BankAccount {
    // Base implementation
    void withdraw(int amount) {
        System.out.println("Withdrawing " + amount + " from bank account");
    }
}

// SavingsAccount overrides withdraw() method - provides specific behavior
class SavingsAccount extends BankAccount {
    @Override  // Overriding parent method
    void withdraw(int amount) {
        System.out.println("Withdrawing " + amount + " from savings account with interest");
    }
}

class CheckingAccount extends BankAccount {
    @Override
    void withdraw(int amount) {
        System.out.println("Withdrawing " + amount + " from checking account, may incur fee");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // COMPILE-TIME POLYMORPHISM (Method Overloading)
        Calculator calc = new Calculator();
        System.out.println("=== Method Overloading ===");
        System.out.println("add(5, 10) = " + calc.add(5, 10));
        System.out.println("add(5.5, 10.5) = " + calc.add(5.5, 10.5));
        System.out.println("add(5, 10, 15) = " + calc.add(5, 10, 15));
        
        // RUNTIME POLYMORPHISM (Method Overriding)
        System.out.println("\n=== Method Overriding ===");
        // Same method name, different behavior based on actual object type
        BankAccount savings = new SavingsAccount();
        BankAccount checking = new CheckingAccount();
        
        savings.withdraw(500);
        checking.withdraw(500);
    }
}
