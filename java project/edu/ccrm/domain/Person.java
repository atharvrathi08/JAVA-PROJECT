package edu.ccrm.domain;

import java.time.LocalDate;

/**
 * Abstract class demonstrating Inheritance and Abstraction
 * Base class for Student and Instructor
 */
public abstract class Person {
    // Encapsulation: private fields with getters/setters
    private String id;
    private String fullName;
    private String email;
    private LocalDate createdDate;
    
    // Constructor
    public Person(String id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.createdDate = LocalDate.now(); // Date/Time API
    }
    
    // Abstract method demonstrating Abstraction
    public abstract String getRole();
    
    // Getters and Setters (Encapsulation)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public LocalDate getCreatedDate() { return createdDate; }
    
    // Polymorphism: Override toString()
    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Email: %s, Role: %s", 
                           id, fullName, email, getRole());
    }
}