package org.sahilo.StructuralPatterns.ProxyPattern.Solution;

public class Client {
    public static void main(String[] args) {
        // Proxy objects created which is faster, as we are not loading the actual images yet
        Image image1 = new ProxyImage("dog.png");
        Image image2 = new ProxyImage("cat.jpg");

        image1.display(); // RealImage is loaded from disk and displayed and cached
        image1.display(); // Cached image is displayed


    }
}
