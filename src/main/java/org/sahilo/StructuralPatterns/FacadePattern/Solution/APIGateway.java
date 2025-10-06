package org.sahilo.StructuralPatterns.FacadePattern.Solution;

public class APIGateway {

    UserService userService;
    OrderService orderService;
    PaymentService paymentService;

    public APIGateway() {
        userService = new UserService();
        orderService = new OrderService();
        paymentService = new PaymentService();
    }

    public void getFullOrderDetails(String userId, String orderId, String paymentId) {
        userService.getUserDetails(userId);
        orderService.getOrderDetails(orderId);
        paymentService.processPayment(paymentId);
    }

}
