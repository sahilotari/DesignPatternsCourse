package org.sahilo.BehaviouralPatterns.CommandPattern.Problem;

public class ItalicButton {
    private final TextEditor textEditor;

    public ItalicButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click(){
        textEditor.italicText();
    }
}
