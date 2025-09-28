package org.sahilo.CreationalPatterns.FactoryPattern.Problem;

public class TransportService {
    public static void main(String[] args) {
        // Directly create objects
        Transport bike = new Bike();
        bike.deliver();

        Transport bus = new Bus();
        bus.deliver();
    }
}
