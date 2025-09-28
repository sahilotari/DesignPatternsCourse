package org.sahilo.CreationalPatterns.FactoryPattern.Solution;

public class TransportService {
    public static void main(String[] args) {
        // Create objects using the factory
        Transport bike = TransportFactory.createTransport("bike");
        bike.deliver();

        Transport bus = TransportFactory.createTransport("bus");
        bus.deliver();

        Transport car = TransportFactory.createTransport("car");
        car.deliver();
    }
}
