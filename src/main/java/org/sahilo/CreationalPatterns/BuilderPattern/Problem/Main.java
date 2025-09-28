package org.sahilo.CreationalPatterns.BuilderPattern.Problem;

public class Main {
    public static void main(String[] args) {
        House house = new House("Concrete", "Wood", "Shingles", "Modern", true, false, true);
        System.out.println(house);
    }
}
