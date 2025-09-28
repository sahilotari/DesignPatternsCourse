package org.sahilo.SOLIDPrinciples.OCP.GoodCode;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        //Long business logic
        System.out.println("Making payment via Credit Card "+amount);
    }
}
