package org.sahilo.BehaviouralPatterns.ObserverPattern.Solution;

public class ObserverPatternMain {
    public static void main(String[] args) {

        //Publisher
        WeatherStation weatherStation = new WeatherStation();


        //Subscribers
        MobileDevice mobileDevice = new MobileDevice();
        DisplayDevice displayDevice = new DisplayDevice();

        //Attach the Subscribers
        weatherStation.addObserver(mobileDevice);
        weatherStation.addObserver(displayDevice);


        // Set Temperature
        weatherStation.setTemperature(28);

        //Remove observer
        System.out.println("After removing observer");
        weatherStation.removeObserver(mobileDevice);
        weatherStation.setTemperature(40);
    }
}
