package by.bsuir.Mukhliada.task15.util;

import by.bsuir.Mukhliada.task12.util.Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

    public int compare(Book book1, Book book2) {
        String titleBook1 = book1.getTitle();
        String titleBook2 = book2.getTitle();

        return titleBook1.compareTo(titleBook2);
    }
}
