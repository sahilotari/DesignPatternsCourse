package org.sahilo.CreationalPatterns.AbstractFactoryPattern.Solution;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}
