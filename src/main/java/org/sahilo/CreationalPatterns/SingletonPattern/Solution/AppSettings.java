package org.sahilo.CreationalPatterns.SingletonPattern.Solution;

public class AppSettings {

    // Step 1: Private static instance of the class
    private static AppSettings instance;

    private String databaseUrl;
    private String apiKey;

    // Step 2: Private constructor to prevent direct object creation
    private AppSettings() {
        // Simulate loading settings from a configuration file or environment variables
        this.databaseUrl = "localhost:5432/mydb";
        this.apiKey = "12345-ABCDE";
    }

    // Step 3: Public static method to provide single instance
    public static AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
