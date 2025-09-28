package org.sahilo.BehaviouralPatterns.ObserverPattern.Solution;

import java.util.ArrayList;
import java.util.List;

// Concrete class for Subject
public class WeatherStation implements Subject{

    private float temperature;
    private List<Observer> observerList;

    public WeatherStation(){
        observerList = new ArrayList<>();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer: observerList){
            observer.update(temperature); // Runtime Polymorphism
        }
        System.out.println();
    }
}
