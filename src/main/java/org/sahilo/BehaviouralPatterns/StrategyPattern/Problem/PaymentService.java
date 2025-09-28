package org.sahilo.BehaviouralPatterns.StrategyPattern.Problem;

public class PaymentService {
    public void processPayment(String paymentMethod) {
        if (paymentMethod.equals("CreditCard")){
            System.out.println("Paying using Credit Card!");
        } else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Paying using Debit Card!");
        } else if (paymentMethod.equals("UPI")){
            // Added later: What if it is big code block?
            System.out.println("Paying using UPI");
        } else {
            System.out.println("Invalid Payment Method!");
        }
    }
}
