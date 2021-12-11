package by.bsuir.Mukhliada.task15.test;

import by.bsuir.Mukhliada.task12.util.Book;
import by.bsuir.Mukhliada.task15.util.Comparators;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class BookTestComparators {
    private static ArrayList<Book> books = new ArrayList<Book>();

    static {
        books.add(new Book("LOTR", "Tolkien", 50, 1));
        books.add(new Book("HP&GoA", "B", 40, 1));
        books.add(new Book("Dragon's book", "Ulman", 100, 1));
        books.add(new Book("HP&SC", "D", 42, 1));
        books.add(new Book("HP&SC", "D", 41, 1));
        books.add(new Book("HP&GoA", "A", 45, 1));
    }

    @Test
    void TitleComparator() {
        Comparator<Book> titleComparator = Comparators.getTitleComparator();
        String expected = "Dragon's bookHP&GoAHP&GoAHP&SCHP&SCLOTR";
        String actual = "";

        books.sort(titleComparator);

        for (Book book : books) {
            actual += book.getTitle();
        }

        assertEquals(actual, expected);
    }

    @Test
    void TitleAuthorComparator() {
        Comparator<Book> titleAuthorComparator = Comparators.getTitleAuthorComparator();
        String expected = "UlmanABDDTolkien";
        String actual = "";

        books.sort(titleAuthorComparator);

        for (Book book : books) {
            actual += book.getAuthor();
        }

        assertEquals(actual, expected);
    }

    @Test
    void AuthorTitleComparator() {
        Comparator<Book> authorTitleComparator = Comparators.getAuthorTitleComparator();
        String expected = "ABDDTolkienUlman";
        String actual = "";

        books.sort(authorTitleComparator);

        for (Book book : books) {
            actual += book.getAuthor();
        }

        assertEquals(actual, expected);
    }

    @Test
    void AllComparator() {
        Comparator<Book> allComparator = Comparators.getAllComparators();
        String expected = "1004540414250";
        String actual = "";

        books.sort(allComparator);

        for (Book book : books) {
            actual += book.getPrice();
        }

        assertEquals(actual, expected);
    }
}