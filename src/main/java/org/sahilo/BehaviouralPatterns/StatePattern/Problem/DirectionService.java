package org.sahilo.BehaviouralPatterns.StatePattern.Problem;

public class DirectionService {
    private TransportMode mode;

    public DirectionService(TransportMode mode) {
        this.mode = mode;
    }
    public void setTransportMode(TransportMode mode) {
        this.mode = mode;
    }

    // Method to calculate ETA based on transport mode
    public int getETA() {
        switch (mode) {
            case WALK:
                return 120; // ETA in minutes
            case CYCLE:
                return 60; // ETA in minutes
            case CAR:
                return 30; // ETA in minutes
            case TRAIN:
                return 20; // ETA in minutes
            default:
                throw new IllegalArgumentException("Unknown transport mode: " + mode);
        }
    }

    // Method to get directions based on transport mode
    public String getDirections() {
        switch (mode) {
            case WALK:
                return "Direction to walk through the main street.";
            case CYCLE:
                return "Cycle through the park and follow the bike lane.";
            case CAR:
                return "Drive via the highway and take exit 23.";
            case TRAIN:
                return "Take the train from Central Station to Downtown.";
            default:
                throw new IllegalArgumentException("Unknown transport mode: " + mode);
        }
    }
}
