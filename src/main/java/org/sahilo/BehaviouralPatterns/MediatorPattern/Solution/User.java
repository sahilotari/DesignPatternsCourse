package org.sahilo.BehaviouralPatterns.MediatorPattern.Solution;

public class User {
    private final String name;

    private ChatMediator chatMediator;
    public User(String name, ChatMediator chatMediator) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        System.out.println(this.name + " to everyone: " + message);
        chatMediator.sendMessage(message, this);
    }

    public void receiveMessage(String message, User sender) {
        System.out.println(this.name + " received from " + sender.getName() + ": " + message);
    }
}
