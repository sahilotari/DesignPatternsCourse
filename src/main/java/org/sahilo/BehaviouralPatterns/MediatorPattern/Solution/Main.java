package org.sahilo.BehaviouralPatterns.MediatorPattern.Solution;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatroom = new ChatRoom();
        User sahil = new User("Sahil", chatroom);
        User om = new User("OM", chatroom);
        User sarthak = new User("Sarthak", chatroom);
        chatroom.addUser(sahil);
        chatroom.addUser(om);
        chatroom.addUser(sarthak);
        sahil.sendMessage("Hi OM, How are you?");

    }
}
