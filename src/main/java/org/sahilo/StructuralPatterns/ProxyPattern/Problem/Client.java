package org.sahilo.StructuralPatterns.ProxyPattern.Problem;

public class Client {
    public static void main(String[] args) {
        Image image1 = new RealImage("photo1.jpg");
        // Image should not be loaded until display is called
        // Here, the RealImage is loaded every time we create it, which can be inefficient if the image is not always needed.
    }
}
