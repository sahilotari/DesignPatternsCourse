package org.sahilo.BehaviouralPatterns.IteratorPattern.Solution;

import java.util.ArrayList;
import java.util.List;

public class BookCollection1 {
    private List<Book1> book1s = new ArrayList<>();

    public List<Book1> getBooks() {
        return book1s;
    }

    public void addBook(Book1 book1){
        book1s.add(book1);
    }

    public Iterator<Book1> createIterator(){
        return new BookIterator(this.book1s);
    }

    // Another class (Nested Class) that implements the Iterator
    public class BookIterator implements Iterator<Book1>{
        private List<Book1> book1s;

        public BookIterator(List<Book1> book1s) {
            this.book1s = book1s;
        }

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < book1s.size();
        }

        @Override
        public Book1 next() {
            return book1s.get(index++);
        }
    }
}
