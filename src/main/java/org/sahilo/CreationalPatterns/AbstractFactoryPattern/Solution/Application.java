package org.sahilo.CreationalPatterns.AbstractFactoryPattern.Solution;

// Client
public class Application {
    private Button button;
    private ScrollBar scrollBar;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        scrollBar = factory.createScrollBar();
    }

    public void renderUI() {
        button.render();
        scrollBar.scroll();
    }
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Application app = new Application(windowsFactory);
        app.renderUI();
    }
}
