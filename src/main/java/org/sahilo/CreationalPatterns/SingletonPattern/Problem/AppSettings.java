package org.sahilo.CreationalPatterns.SingletonPattern.Problem;

public class AppSettings {
    private String databaseUrl;
    private String apiKey;

    public AppSettings() {
        // Simulate loading settings from a configuration file or environment variables
        this.databaseUrl = "localhost:5432/mydb";
        this.apiKey = "12345-ABCDE";
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
