package org.sahilo.Basics.OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("SahilDebitCard", new DebitCard("123456","Sahil Otari"));
        ps.addPaymentMethod("SahilCreditCard", new CreditCard("345678","Sahil Otari"));
        ps.addPaymentMethod("SahilUPI", new UPI("sahilotari3"));

        ps.makePayment("SahilUPI");
        ps.makePayment("SahilDebitCard");
    }
}

