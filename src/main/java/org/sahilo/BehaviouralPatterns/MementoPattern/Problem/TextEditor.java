package org.sahilo.BehaviouralPatterns.MementoPattern.Problem;

/*A text editor where user can undo changes, such as text addition or formatting. The
editor stores snapshots of its state (text content) after each change,
enabling user to revert to previous states.
*/
public class TextEditor {
    private String content;

    public void write(String text) {
        this.content = text;
    }

    public String getContent() {
        return content;
    }
}
