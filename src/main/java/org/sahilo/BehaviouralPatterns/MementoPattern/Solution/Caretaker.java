package org.sahilo.BehaviouralPatterns.MementoPattern.Solution;

import org.sahilo.BehaviouralPatterns.MementoPattern.Solution.TextEditor;

import java.util.Stack;

// Caretaker Class: Manage mementos (Snapshots of the TextEditor state)
public class Caretaker {
    private final Stack<EditorMemento> history = new Stack<>();
     public void saveState(TextEditor editor) {
         // history.push();\
         history.push(editor.save());
     }

     public void undo(TextEditor editor) {
         if(!history.empty()) {
             // history.restore()
             history.pop();
             editor.restore(history.peek());
         }
     }
}
