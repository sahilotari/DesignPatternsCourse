package org.sahilo.BehaviouralPatterns.CommandPattern.Solution;
// Concrete Command: BoldCommand class
public class BoldCommand implements Command{

    private final TextEditor textEditor;

    public BoldCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }
    @Override
    public void execute() {
        textEditor.boldText();
    }
}
