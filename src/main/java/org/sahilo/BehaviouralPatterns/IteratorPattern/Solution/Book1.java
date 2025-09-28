package org.sahilo.BehaviouralPatterns.IteratorPattern.Solution;

public class Book1 {
    private String title;

    public Book1(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
