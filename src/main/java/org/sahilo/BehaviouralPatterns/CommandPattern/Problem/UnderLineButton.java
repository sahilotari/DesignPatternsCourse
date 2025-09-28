package org.sahilo.BehaviouralPatterns.CommandPattern.Problem;

public class UnderLineButton {
    private final TextEditor textEditor;

    public UnderLineButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click(){
        textEditor.underlineText();
    }
}
