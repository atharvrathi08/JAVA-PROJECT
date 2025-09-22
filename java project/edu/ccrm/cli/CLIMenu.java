package edu.ccrm.cli;

import java.util.Scanner;

/**
 * CLI Menu demonstrating loops, switch, and user interaction
 */
public class CLIMenu {
    private Scanner scanner;
    private boolean running;
    
    public CLIMenu() {
        this.scanner = new Scanner(System.in);
        this.running = true;
    }
    
    public void start() {
        // Main loop demonstrating while loop
        while (running) {
            displayMainMenu();
            int choice = getIntInput("Enter your choice: ");
            
            // Enhanced switch statement (Java 14+)
            switch (choice) {
                case 1 -> manageStudents();
                case 2 -> manageCourses();
                case 3 -> manageEnrollment();
                case 4 -> backupData();
                case 5 -> showReports();
                case 0 -> exitProgram();
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    
    private void displayMainMenu() {
        System.out.println("\n=== CCRM Main Menu ===");
        System.out.println("1. Manage Students");
        System.out.println("2. Manage Courses");
        System.out.println("3. Manage Enrollment");
        System.out.println("4. Backup Data");
        System.out.println("5. Reports");
        System.out.println("0. Exit");
        System.out.println("======================");
    }
    
    private void manageStudents() {
        System.out.println("\n--- Student Management ---");
        // Demonstrating for loop
        String[] operations = {"Add Student", "List Students", "Update Student", "Back"};
        
        for (int i = 0; i < operations.length; i++) {
            System.out.println((i + 1) + ". " + operations[i]);
        }
        
        int choice = getIntInput("Choose operation: ");
        // Demonstrating break in switch
        switch (choice) {
            case 1:
                System.out.println("Adding student...");
                break;
            case 2:
                System.out.println("Listing students...");
                break;
            case 3:
                System.out.println("Updating student...");
                break;
            case 4:
                System.out.println("Returning to main menu...");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    
    private void manageCourses() {
        System.out.println("\n--- Course Management ---");
        // Enhanced for loop demonstration
        String[] courses = {"CS101", "MA201", "PH301"};
        System.out.println("Available courses:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
    
    private void manageEnrollment() {
        System.out.println("\n--- Enrollment Management ---");
        System.out.println("Enrollment features coming soon...");
    }
    
    private void backupData() {
        System.out.println("\n--- Backup Data ---");
        System.out.println("Creating backup...");
    }
    
    private void showReports() {
        System.out.println("\n--- Reports ---");
        System.out.println("Generating reports...");
    }
    
    private void exitProgram() {
        System.out.println("Thank you for using CCRM!");
        running = false;
        scanner.close();
    }
    
    // Utility method for input
    private int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number!");
            scanner.next(); // clear invalid input
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }
}