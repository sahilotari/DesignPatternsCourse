package org.sahilo.CreationalPatterns.BuilderPattern.Solution;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Concrete", "Wood", "Shingles")
                .setInterior("Modern")
                .setHasGarage(false)
                .setHasGarden(true)
                .build();
        System.out.println(house);
    }
}
