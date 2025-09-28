package org.sahilo.BehaviouralPatterns.IteratorPattern.Problem;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }
}
