package org.sahilo.BehaviouralPatterns.ObserverPattern.Problem;

class DisplayDevice{
    public void show(float temperature){
        System.out.println("Current Temperature: "+ temperature + "C");
    }
}

class WeatherStation{
    private float temperature;
    private DisplayDevice device; // can be multiple such devices

    public WeatherStation(DisplayDevice device){
        this.device = device;
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyDevices();
    }

    private void notifyDevices() {
        device.show(temperature);
    }

}


public class WithoutObserverPattern {
    public static void main(String[] args) {
        DisplayDevice device = new DisplayDevice();
        WeatherStation station = new WeatherStation(device);
        //Here, we see tight coupling, because Workstation need to know all the DisplayStations to Notify.

        station.setTemperature(27);
        station.setTemperature(30);

    }
}
