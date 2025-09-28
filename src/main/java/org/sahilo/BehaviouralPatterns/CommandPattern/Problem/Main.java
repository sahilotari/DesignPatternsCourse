package org.sahilo.BehaviouralPatterns.CommandPattern.Problem;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        BoldButton boldButton = new BoldButton(textEditor);
        ItalicButton italicButton = new ItalicButton(textEditor);
        UnderLineButton underLineButton = new UnderLineButton(textEditor);

        boldButton.click();
        italicButton.click();
        underLineButton.click();
    }
}
