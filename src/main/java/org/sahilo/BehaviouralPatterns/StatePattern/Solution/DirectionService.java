package org.sahilo.BehaviouralPatterns.StatePattern.Solution;

// Context
public class DirectionService {
    TransportationMode mode;

    public DirectionService(TransportationMode mode) {
        this.mode = mode;
    }

    public void setTransportationMode(TransportationMode mode) {
        this.mode = mode;
    }

    // Delegating the work to current state concrete class
    public int getETA() {
        return mode.getETA();
    }

    public String getDirections() {
        return mode.getDirections();
    }
}
