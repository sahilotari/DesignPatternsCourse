package org.sahilo.BehaviouralPatterns.StatePattern.Solution;

public class Main {
    public static void main(String[] args) {
        DirectionService service = new DirectionService(new Walking());
        System.out.println("Mode: WALK");
        System.out.println("ETA: " + service.getETA() + " minutes");
        System.out.println("Directions: " + service.getDirections());

        service.setTransportationMode(new Car());
        System.out.println("\nMode: CAR");
        System.out.println("ETA: " + service.getETA() + " minutes");
        System.out.println("Directions: " + service.getDirections());
    }
}
