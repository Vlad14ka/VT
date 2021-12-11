package by.bsuir.Mukhliada.task15.util;

import by.bsuir.Mukhliada.task12.util.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {

    public int compare(Book book1, Book book2) {
        String authorBook1 = book1.getAuthor();
        String authorBook2 = book2.getAuthor();

        return authorBook1.compareTo(authorBook2);
    }
}
