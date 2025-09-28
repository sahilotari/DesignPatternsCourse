package org.sahilo.BehaviouralPatterns.MediatorPattern.Solution;

import org.sahilo.SOLIDPrinciples.ISP.GoodCode.Printer;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // message should not be received by the user sending it
            if (u != user) {
                u.receiveMessage(message, user);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
