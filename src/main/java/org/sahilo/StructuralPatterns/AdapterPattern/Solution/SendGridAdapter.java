package org.sahilo.StructuralPatterns.AdapterPattern.Solution;

public class SendGridAdapter implements NotificationService{
    private SendGrid sendGrid;

    public SendGridAdapter(SendGrid sendGrid) {
        this.sendGrid = sendGrid;
    }

    @Override
    public void send(String to, String subject, String body) {
        // Addapter method to convert parameters and method call to SendGrid's format
        sendGrid.sendEmail(to, subject, body);
    }
}
