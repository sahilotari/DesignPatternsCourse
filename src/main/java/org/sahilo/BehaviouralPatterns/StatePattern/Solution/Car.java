package org.sahilo.BehaviouralPatterns.StatePattern.Solution;

public class Car implements TransportationMode{
    @Override
    public int getETA() {
        return 30;
    }

    @Override
    public String getDirections() {
        return "Drive via the highway and take exit 23.";
    }
}
