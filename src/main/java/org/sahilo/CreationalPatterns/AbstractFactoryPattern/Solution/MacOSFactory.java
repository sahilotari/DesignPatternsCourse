package org.sahilo.CreationalPatterns.AbstractFactoryPattern.Solution;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollBar();
    }
}
