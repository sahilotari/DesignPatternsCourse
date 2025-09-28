package org.sahilo.BehaviouralPatterns.MediatorPattern.Problem;

public class Main {
    public static void main(String[] args) {
        User sahil = new User("Sahil");
        User om = new User("OM");
        User sarthak = new User("Sarthak");
        sahil.sendMessage("Hi OM, How are you?", om);
        om.sendMessage("I am good, What about you?", sahil);
        sarthak.sendMessage("Hey Guys, What are you discussing?", sahil);
        sarthak.sendMessage("Hey Guys, What are you discussing?", om);
    }
}
