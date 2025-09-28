package org.sahilo.BehaviouralPatterns.StatePattern.Solution;

public class Cycling implements TransportationMode{
    @Override
    public int getETA() {
        return 60;
    }

    @Override
    public String getDirections() {
        return "Direction to cycle through the park.";
    }
}
