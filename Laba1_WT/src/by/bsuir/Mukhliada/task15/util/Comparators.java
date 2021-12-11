package by.bsuir.Mukhliada.task15.util;

import by.bsuir.Mukhliada.task12.util.Book;

import java.util.Comparator;

public class Comparators {
    public static Comparator<Book> getTitleComparator() {
        return new TitleComparator();
    }

    public static Comparator<Book> getTitleAuthorComparator() {
        return new TitleComparator().thenComparing(new AuthorComparator());
    }

    public static Comparator<Book> getAuthorTitleComparator() {
        return new AuthorComparator().thenComparing(new TitleComparator());
    }

    public static Comparator<Book> getAllComparators() {
        return new TitleComparator().thenComparing(new AuthorComparator()).thenComparing(new PriceComparator());
    }
}
