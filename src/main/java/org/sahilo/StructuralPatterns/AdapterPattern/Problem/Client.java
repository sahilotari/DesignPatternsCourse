package org.sahilo.StructuralPatterns.AdapterPattern.Problem;

public class Client {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        emailService.send("sahil@gmail.com", "Welcome", "Hello Sahil, welcome to our service!");
    }
}
