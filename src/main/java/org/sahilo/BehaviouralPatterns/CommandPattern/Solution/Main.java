package org.sahilo.BehaviouralPatterns.CommandPattern.Solution;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        //Decoupling
        // One button can do many type of actions, decoupled from text editor
        Button button = new Button();
        button.setCommand(new BoldCommand(textEditor));
        button.click();

        button.setCommand(new ItalicCommand(textEditor));
        button.click();
    }
}
