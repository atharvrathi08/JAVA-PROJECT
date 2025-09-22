package edu.ccrm.domain;

/**
 * Enum demonstrating Enum with constructor and fields
 */
public enum Semester {
    SPRING("Spring", "SPR"),
    SUMMER("Summer", "SUM"), 
    FALL("Fall", "FAL"),
    WINTER("Winter", "WIN");
    
    // Enum fields
    private final String fullName;
    private final String code;
    
    // Enum constructor
    Semester(String fullName, String code) {
        this.fullName = fullName;
        this.code = code;
    }
    
    // Getters
    public String getFullName() { return fullName; }
    public String getCode() { return code; }
    
    // Static method to get enum by code
    public static Semester getByCode(String code) {
        for (Semester semester : values()) {
            if (semester.code.equalsIgnoreCase(code)) {
                return semester;
            }
        }
        return null;
    }
}