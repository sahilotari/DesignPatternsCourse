package org.sahilo.StructuralPatterns.FacadePattern.Solution;

public class Client {
    public static void main(String[] args) {
        // Client code interacting with APIGateway (facade)
        APIGateway apiGateway = new APIGateway();
        apiGateway.getFullOrderDetails("user123", "order456", "payment789");

    }
}
