package org.sahilo.Basics.OOPS;

public class CreditCard extends Cards implements PaymentMethod{

    private String cardNo;
    private String userName;

    public CreditCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Credit Card");
    }
}
