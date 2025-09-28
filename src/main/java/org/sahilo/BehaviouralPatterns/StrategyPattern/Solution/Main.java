package org.sahilo.BehaviouralPatterns.StrategyPattern.Solution;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        // Using CreditCard strategy
        paymentService.setPaymentStrategy(new CreditCard());
        paymentService.pay(100.0);

        // Switching to DebitCard strategy
        paymentService.setPaymentStrategy(new DebitCard());
        paymentService.pay(50.0);
    }
}
