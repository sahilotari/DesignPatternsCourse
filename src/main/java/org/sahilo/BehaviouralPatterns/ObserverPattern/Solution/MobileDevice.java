package org.sahilo.BehaviouralPatterns.ObserverPattern.Solution;
// Concrete observer
public class MobileDevice implements Observer{
    @Override
    public void update(float temp) {
        System.out.println("Temperature on Mobile is " + temp);
    }
}
