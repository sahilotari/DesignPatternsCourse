package org.sahilo.StructuralPatterns.AdapterPattern.Solution;

public class Client {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        emailService.send("sahil@gmail.com", "Welcome", "Hello Sahil, welcome to our service!");

       // NotificationService sendGridService = new SendGrid();
        // Cant do this as SendGrid class has different method signature and does not implement NotificationService interface
        // We need to use an adapter to make it compatible

        NotificationService sendGridService = new SendGridAdapter(new SendGrid());
        sendGridService.send("sahil@gmail.com", "Welcome", "Hello Sahil, welcome to our service!");
    }
}
