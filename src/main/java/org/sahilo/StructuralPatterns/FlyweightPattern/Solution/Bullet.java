package org.sahilo.StructuralPatterns.FlyweightPattern.Solution;

public class Bullet {
    private BulletType type;
    private int x, y;  // Extrinsic properties: Unique to each object
    private int velocity; // Extrinsic property: Unique to each object

    public Bullet(String color, int x, int y, int velocity) {
        this.type = BulletTypeFactory.getBulletType(color);
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Creating a " + color + " bullet at (" + x + ", " + y + ") with velocity " + velocity);
    }

    public void display() {
        System.out.println("Displaying a " + type.getColor() + " bullet at (" + x + ", " + y + ") with velocity " + velocity);
    }

}
