package org.sahilo.CreationalPatterns.AbstractFactoryPattern.Solution;

public class WindowsScrollBar implements ScrollBar{
    @Override
    public void scroll() {
        System.out.println("Scrolling Windows ScrollBar");
    }
}
