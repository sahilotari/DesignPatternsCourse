package org.sahilo.BehaviouralPatterns.CommandPattern.Solution;

import org.sahilo.BehaviouralPatterns.CommandPattern.Problem.TextEditor;

// Concrete Command: UnderLineCommand class
public class UnderLineCommand implements Command{
    private final TextEditor textEditor;

    public UnderLineCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.underlineText();
    }
}
