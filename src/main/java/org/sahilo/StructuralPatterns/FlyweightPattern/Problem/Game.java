package org.sahilo.StructuralPatterns.FlyweightPattern.Problem;

public class Game {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Bullet redBullet = new Bullet("Red", i * 10, i * 20, 100 + i * 10);
        }

        for(int i = 0; i < 5; i++) {
            Bullet blueBullet = new Bullet("Blue", i * 15, i * 25, 150 + i * 15);
        }

        // Problems:
        // 1. High memory usage: Each bullet instance consumes memory, leading to high memory usage when many bullets are created.
        // 2. Performance issues: Creating and destroying many bullet objects can lead to performance degradation
        // 3. Difficulty in managing shared properties: If we want to change the color of all red bullets, we have to update each instance individually.

    }
}
