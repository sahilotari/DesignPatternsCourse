package org.sahilo.SOLIDPrinciples.OCP.GoodCode;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount); //kind of runtime polymorphism
    }
}

// If I want to add new payment method UPI, I can create new class