package org.sahilo.BehaviouralPatterns.ObserverPattern.Solution;
// Concrete observer
public class DisplayDevice implements Observer{
    @Override
    public void update(float temp) {
        System.out.println("Temperature on Display Device is "+ temp);
    }
}
