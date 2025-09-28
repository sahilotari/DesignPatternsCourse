package org.sahilo.BehaviouralPatterns.StrategyPattern.Problem;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("CreditCard");
        paymentService.processPayment("DebitCard");
    }
}
