package org.sahilo.LLDProjects.RideSharing.V1;

public class Passenger {
    String name;
    Location location;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
