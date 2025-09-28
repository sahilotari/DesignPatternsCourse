package org.sahilo.BehaviouralPatterns.StatePattern.Solution;

// Concrete State
public class Walking implements TransportationMode{
    @Override
    public int getETA() {
        return 120;
    }

    @Override
    public String getDirections() {
        return "Direction to walk through the main street.";
    }
}
