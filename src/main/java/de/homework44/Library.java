package de.homework44;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library<T extends Book> {
    private List<T> books = new ArrayList<>();

    public void addBook(T book) {
        books.add(book);
    }
    public boolean removeBook(String title){
        Iterator <T> iterator = books.iterator();
        while (iterator.hasNext()) {
            T currentBook = iterator.next();
            if (currentBook.getTitle().equals(title)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public T findBook(String title) {
        for (T book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
    public void listBooks() {
        for (T book : books) {
            System.out.println(book.getDescription());
        }
    }
}
