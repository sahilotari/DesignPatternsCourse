package org.sahilo.BehaviouralPatterns.StrategyPattern.Solution;

//Concrete Strategy
public class DebitCard implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing debit card payment of $" + amount);
    }
}
