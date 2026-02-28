package OOP;

/*
 * ENCAPSULATION
 * OOP Concept: Encapsulation - data hiding and controlled access via getters/setters
 * This example demonstrates:
 * - Private variables - data cannot be accessed directly from outside
 * - Getters - read-only access to private variables
 * - Setters - controlled write access with validation
 * - Data protection - setGpa() validates input before assigning
 */
class Student {
    // Private variables - cannot be accessed directly outside this class
    private String name;
    private int rollNo;
    private double gpa;
    
    // Constructor
    Student(String name, int rollNo, double gpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.gpa = gpa;
    }
    
    // Getters - read-only access to private data
    String getName() {
        return name;
    }
    
    int getRollNo() {
        return rollNo;
    }
    
    double getGpa() {
        return gpa;
    }
    
    // Setters - controlled access with validation to protect data integrity
    void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA");
        }
    }
    
    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", GPA: " + gpa);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s1 = new Student("Charlie", 101, 3.8);
        s1.display();
        
        s1.setGpa(3.9);
        System.out.println("Updated GPA: " + s1.getGpa());
        
        s1.setGpa(5.0); // Invalid
    }
}
