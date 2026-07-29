package org.sahilo.StructuralPatterns.FlyweightPattern.Solution;

// Flyweight class representing shared bullet type properties
public class BulletType {
    private String color;

    public BulletType(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
