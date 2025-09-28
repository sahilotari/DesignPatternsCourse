package org.sahilo.CreationalPatterns.AbstractFactoryPattern.Solution;

public class MacScrollBar implements ScrollBar{
    @Override
    public void scroll() {
        System.out.println("Scrolling Mac ScrollBar");
    }
}
