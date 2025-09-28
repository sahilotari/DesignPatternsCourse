package org.sahilo.BehaviouralPatterns.CommandPattern.Solution;

// Invoker: Button class which is completely decoupled from TextEditor
public class Button {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}
