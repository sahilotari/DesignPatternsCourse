package org.sahilo.BehaviouralPatterns.MediatorPattern.Problem;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message, User recepient) {
        System.out.println(this.name + " to " + recepient.getName() + ": " + message);
    }
}
