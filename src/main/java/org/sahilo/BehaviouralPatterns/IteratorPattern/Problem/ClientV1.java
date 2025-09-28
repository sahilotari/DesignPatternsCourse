package org.sahilo.BehaviouralPatterns.IteratorPattern.Problem;

public class ClientV1 {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Book 1"));
        bookCollection.addBook(new Book("Book 2"));
        bookCollection.addBook(new Book("Book 3"));

        for(int i = 0; i < bookCollection.getBooks().size(); i++){
            System.out.println(bookCollection.getBooks().get(i));
        }
    }
}
