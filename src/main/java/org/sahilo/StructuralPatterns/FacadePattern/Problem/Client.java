package org.sahilo.StructuralPatterns.FacadePattern.Problem;

public class Client {
    public static void main(String[] args) {
        // Client code interacting with multiple services directly
        UserService userService = new UserService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();

        // Tasks
        userService.getUserDetails("U123");
        orderService.getOrderDetails("O456");
        paymentService.processPayment("P789");
    }
}
