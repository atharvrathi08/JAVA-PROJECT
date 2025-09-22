package edu.ccrm.config;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Singleton class for application configuration
 * Demonstrates Singleton design pattern
 */
public class AppConfig {
    private static AppConfig instance;
    private final String dataPath;
    private final LocalDateTime startTime;
    
    // Private constructor for Singleton
    private AppConfig() {
        this.dataPath = "data/";
        this.startTime = LocalDateTime.now();
        System.out.println("AppConfig created at: " + startTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
    }
    
    // Singleton instance getter
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }
    
    // Getters
    public String getDataPath() { return dataPath; }
    public LocalDateTime getStartTime() { return startTime; }
}