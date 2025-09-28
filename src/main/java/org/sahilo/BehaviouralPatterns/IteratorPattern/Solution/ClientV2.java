package org.sahilo.BehaviouralPatterns.IteratorPattern.Solution;

public class ClientV2 {
    public static void main(String[] args) {
        BookCollection1  bookCollection1 = new BookCollection1();
        bookCollection1.addBook(new Book1("Book 1"));
        bookCollection1.addBook(new Book1("Book 2"));
        bookCollection1.addBook(new Book1("Book 3"));

        Iterator<Book1> iterator = bookCollection1.createIterator();
        while (iterator.hasNext()){
            Book1 book = iterator.next();
            System.out.println(book);
        }
    }
}
