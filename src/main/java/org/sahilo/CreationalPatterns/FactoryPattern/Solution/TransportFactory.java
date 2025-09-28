package org.sahilo.CreationalPatterns.FactoryPattern.Solution;

public class TransportFactory {
    public static Transport createTransport(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "bus":
                return new Bus();
            default:
                throw new IllegalArgumentException("Unknown transport type: " + type);
        }
    }
}
