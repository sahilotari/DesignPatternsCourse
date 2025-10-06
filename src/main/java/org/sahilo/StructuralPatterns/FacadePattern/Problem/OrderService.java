package org.sahilo.StructuralPatterns.FacadePattern.Problem;

public class OrderService {
    public void getOrderDetails(String orderId) {
        System.out.println("Fetching order details..." + orderId);
    }
}
