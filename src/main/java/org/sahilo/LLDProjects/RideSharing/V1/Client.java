package org.sahilo.LLDProjects.RideSharing.V1;

public class Client {
    public static void main(String[] args) {
        Location loc1 = new Location(12.9716, 77.5946);
        Location loc2 = new Location(12.2958, 76.6394);
        Location loc3 = new Location(13.0827, 80.2707);

        // Create Vehicles
        Vehicle car = new Vehicle("KA01AB1234", "Car");
        Vehicle bike = new Vehicle("KA02CD5678", "Bike");

        // Create Drivers
        Driver driver1 = new Driver("Alice", car, loc1);
        Driver driver2 = new Driver("Bob", bike, loc2);

        // Create Passenger
        Passenger passenger = new Passenger("Charlie");
        Passenger passenger2 = new Passenger("David");
        passenger.setLocation(loc3);
        passenger2.setLocation(new Location(12.2718, 76.5940));

        // Ride Sharing Service
        RideSharingAppService rideSharingService = new RideSharingAppService();
        rideSharingService.addDriver(driver1);
        rideSharingService.addDriver(driver2);
        rideSharingService.addPassenger(passenger);
        rideSharingService.addPassenger(passenger2);

        // Book Rides
        rideSharingService.bookRide(passenger, 15.0); // 15 km ride
        rideSharingService.bookRide(passenger2, 5.0); // 5 km


    }
}
