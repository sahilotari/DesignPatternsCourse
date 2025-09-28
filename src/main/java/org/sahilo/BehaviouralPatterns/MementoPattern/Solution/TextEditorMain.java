package org.sahilo.BehaviouralPatterns.MementoPattern.Solution;

import org.sahilo.BehaviouralPatterns.MementoPattern.Solution.TextEditor;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.write("Hello world");
        caretaker.saveState(editor);

        editor.write("Hello everyone");
        caretaker.saveState(editor);
        // Problem -> undo the last write
        System.out.println(editor.getContent());

        // Problem -> undo the last write
        System.out.println("after undo operation: ");
        caretaker.undo(editor);
        System.out.println(editor.getContent());
    }
}
