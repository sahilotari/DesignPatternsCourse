package org.sahilo.StructuralPatterns.FlyweightPattern.Problem;

public class Bullet {
    private String color; // Intrinsic property: Shared by all objects of the same type
    private int x, y;  // Extrinsic properties: Unique to each object
    private int velocity; // Extrinsic property: Unique to each object

    public Bullet(String color, int x, int y, int velocity) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Creating a " + color + " bullet at (" + x + ", " + y + ") with velocity " + velocity);
    }

    public void display() {
        System.out.println("Displaying a " + color + " bullet at (" + x + ", " + y + ") with velocity " + velocity);
    }

}
