package org.sahilo.BehaviouralPatterns.MementoPattern.Solution;

/*A text editor where user can undo changes, such as text addition or formatting. The
editor stores snapshots of its state (text content) after each change,
enabling user to revert to previous states.
*/
public class TextEditor {
    private String content;

    public void write(String text) {
        this.content = text;
    }

    //Save the current state of Editor
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    //Restore: Take memento and update the state of current  content)
    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }

    public String getContent() {
        return content;
    }
}
