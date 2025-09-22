package edu.ccrm;

import edu.ccrm.cli.CLIMenu;
import edu.ccrm.config.AppConfig;

/**
 * Main class for Campus Course & Records Manager (CCRM)
 * Demonstrates basic Java structure and main method
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Campus Course & Records Manager (CCRM) ===");
        
        // Singleton pattern demonstration
        AppConfig config = AppConfig.getInstance();
        System.out.println("App initialized with data path: " + config.getDataPath());
        
        // Start CLI menu
        CLIMenu menu = new CLIMenu();
        menu.start();
    }
}