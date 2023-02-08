package Book;

import java.util.Iterator;

public class Library<T> implements Iterable<Book> {

    private Book[] books;

    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    public Library(Book... books) {
        this.books = books;
    }

    private class LibIterator implements Iterator<Book>{
        private int counter;

        public LibIterator() {
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return this.counter < books.length;
        }

        @Override
        public Book next() {
            Book result = books[this.counter];
            this.counter++;
            return result;
        }
    }
}
