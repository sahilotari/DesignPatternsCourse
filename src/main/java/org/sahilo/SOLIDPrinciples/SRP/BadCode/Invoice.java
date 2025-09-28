package org.sahilo.SOLIDPrinciples.SRP.BadCode;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    //Additional functionality
    public void generateInvoice() {
        System.out.println("Invoice generated and printed for amount "+amount);
    }

    public void saveToDatabase() {
        System.out.println("Saving invoice to database");
    }

    public void sendEmailNotification() {
        System.out.println("Sending email notification for invoice");
    }
}
