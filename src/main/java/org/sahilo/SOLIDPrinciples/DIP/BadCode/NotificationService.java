package org.sahilo.SOLIDPrinciples.DIP.BadCode;

public class NotificationService {
    private EmailService  emailService;
    private SMSService smsService;

    public NotificationService() {
        emailService = new EmailService();
        smsService = new SMSService();
    }

    public void notifyByEmail(String msg) {
        emailService.sendEmail(msg);
    }

    public void notifyBySMS(String msg) {
        smsService.sendSMS(msg);
    }

}

// Tight coupling is there, If someone changes EmailService or SMSService
// This is less flexible code
// Testing is difficult