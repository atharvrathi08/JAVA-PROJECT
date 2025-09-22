package edu.ccrm.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Student class demonstrating Inheritance from Person
 */
public class Student extends Person {
    private String regNo;
    private String status;
    private List<String> enrolledCourses;
    
    public Student(String id, String regNo, String fullName, String email) {
        super(id, fullName, email); // super keyword for parent constructor
        this.regNo = regNo;
        this.status = "ACTIVE";
        this.enrolledCourses = new ArrayList<>();
    }
    
    // Implementing abstract method
    @Override
    public String getRole() {
        return "STUDENT";
    }
    
    // Method overloading (Polymorphism)
    public void enrollCourse(String courseCode) {
        enrolledCourses.add(courseCode);
    }
    
    public void enrollCourse(String courseCode, String semester) {
        enrolledCourses.add(courseCode + " (" + semester + ")");
    }
    
    // Getters and Setters
    public String getRegNo() { return regNo; }
    public void setRegNo(String regNo) { this.regNo = regNo; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public List<String> getEnrolledCourses() { return enrolledCourses; }
    
    // Override toString() for better output
    @Override
    public String toString() {
        return super.toString() + String.format(", RegNo: %s, Status: %s", regNo, status);
    }
}