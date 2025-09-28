package org.sahilo.BehaviouralPatterns.StatePattern.Problem;

public class Main {
    public static void main(String[] args) {
        DirectionService service = new DirectionService(TransportMode.WALK);
        System.out.println("Mode: WALK");
        System.out.println("ETA: " + service.getETA() + " minutes");
        System.out.println("Directions: " + service.getDirections());

        service.setTransportMode(TransportMode.CAR);
        System.out.println("\nMode: CAR");
        System.out.println("ETA: " + service.getETA() + " minutes");
        System.out.println("Directions: " + service.getDirections());
    }
}
