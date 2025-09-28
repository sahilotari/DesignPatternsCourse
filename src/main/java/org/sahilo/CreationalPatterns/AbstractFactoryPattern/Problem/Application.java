package org.sahilo.CreationalPatterns.AbstractFactoryPattern.Problem;

// Client
public class Application {
    public static void main(String[] args) {
        // Windows UI components
        WindowsButton windowsButton = new WindowsButton();
        WindowsScrollBar windowsScrollBar = new WindowsScrollBar();
        windowsButton.renter();
        windowsScrollBar.scroll();

        // Mac UI components
        MacButton macButton = new MacButton();
        MacScrollBar macScrollBar = new MacScrollBar();
        macButton.renter();
        macScrollBar.scroll();
    }
}
