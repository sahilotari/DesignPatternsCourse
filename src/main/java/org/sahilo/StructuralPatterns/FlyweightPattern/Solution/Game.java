package org.sahilo.StructuralPatterns.FlyweightPattern.Solution;

public class Game {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Bullet redBullet = new Bullet("Red", i * 10, i * 20, 100 + i * 10);
        }

        for(int i = 0; i < 5; i++) {
            Bullet blueBullet = new Bullet("Blue", i * 15, i * 25, 150 + i * 15);
        }
    }
}
