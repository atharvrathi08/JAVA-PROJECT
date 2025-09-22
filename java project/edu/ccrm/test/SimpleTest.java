package edu.ccrm.test;

import edu.ccrm.domain.Person;
import edu.ccrm.domain.Student;
import edu.ccrm.domain.Semester;

/**
 * Simple test class demonstrating basic functionality
 */
public class SimpleTest {
    public static void main(String[] args) {
        System.out.println("=== CCRM Simple Test ===");
        
        // Create a student
        Student student = new Student("S001", "2023001", "John Doe", "john@edu.ccrm");
        student.enrollCourse("CS101");
        student.enrollCourse("MA201", Semester.SPRING.getCode());
        
        // Polymorphism: Person reference to Student object
        Person person = student;
        
        System.out.println("Student Info: " + student);
        System.out.println("Person Info: " + person); // Uses overridden toString()
        System.out.println("Role: " + person.getRole()); // Polymorphic method call
        
        // Enum demonstration
        System.out.println("\n=== Semesters ===");
        for (Semester semester : Semester.values()) {
            System.out.println(semester + ": " + semester.getFullName() + " (" + semester.getCode() + ")");
        }
        
        // Array demonstration
        String[] courses = {"CS101", "MA201", "PH301"};
        System.out.println("\n=== Courses Array ===");
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course " + (i + 1) + ": " + courses[i]);
        }
    }
}