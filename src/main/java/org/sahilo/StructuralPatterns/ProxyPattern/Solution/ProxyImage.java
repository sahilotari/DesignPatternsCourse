package org.sahilo.StructuralPatterns.ProxyPattern.Solution;

public class ProxyImage implements Image{

    private String fileName;
    private RealImage realImage; // Proxy reference to real image
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName); // Load only when needed  and Cached
        }
        realImage.display();
    }
}
