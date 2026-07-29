package org.sahilo.LLDProjects.RideSharing.V1;

import java.util.ArrayList;
import java.util.List;

public class RideSharingAppService {
    // Matching Service
    private List<Driver> drivers = new ArrayList<>();

    private List<Passenger> passengers = new ArrayList<>();


    // Methods to add drivers and passengers to the system
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }


    // Book ride
    public void bookRide(Passenger passenger, double distance) {
        // Corner cases
        if(drivers.isEmpty()) {
            System.out.println("No drivers available for " + passenger.getName());
            return;
        }
        // Hardcoded assignment logic
        // Find the nearest available driver
        Driver asignedDriver = null;
        double minDistance = Double.MAX_VALUE;
        for(Driver driver: drivers){
            double curDriverDistance = calculateDistance(passenger.getLocation(), driver.getLocation());
            if(curDriverDistance < minDistance) {
                minDistance = curDriverDistance;
                asignedDriver = driver;
            }
        }

        // Fare Calculation
        assert asignedDriver != null;
        double expectedFare = calculateFare(asignedDriver.getVehicle(),  distance);

        // Show the driver and fare details
        System.out.println("Passenger " + passenger.getName() + " is assigned to Driver " + asignedDriver.getName() +
                " with Vehicle " + asignedDriver.getVehicle().numberPlate +
                ". Expected Fare: $" + expectedFare);
    }

    private double calculateFare(Vehicle vehicle, double distance) {
        if(vehicle.vehicleType.equals("Car")) {
            return distance * 20; // Rs 20 per km for Car
        } else if(vehicle.vehicleType.equals("Bike")) {
            return distance * 10; // Rs 10 per km for Bike
        } else {
            return distance * 2.0; // Default fare
        }
    }

    private double calculateDistance(Location one, Location two) {
        // Euclidean distance calculation
        double dx = one.getLatitude() - two.getLatitude();
        double dy = one.getLongitude() - two.getLongitude();
        return Math.sqrt(dx * dx + dy * dy);
        // Havarsine formula can be used for more accurate distance calculation
    }

}
