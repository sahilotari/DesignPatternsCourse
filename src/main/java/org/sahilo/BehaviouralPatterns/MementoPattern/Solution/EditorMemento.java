package org.sahilo.BehaviouralPatterns.MementoPattern.Solution;
// Mementor Class: Stores the internal state of TextEditor
public class EditorMemento {
    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
