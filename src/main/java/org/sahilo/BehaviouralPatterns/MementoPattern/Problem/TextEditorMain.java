package org.sahilo.BehaviouralPatterns.MementoPattern.Problem;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.write("Hello world");
        editor.write("Hello everyone");
        // Problem -> undo the last write
        System.out.println(editor.getContent());
    }
}
