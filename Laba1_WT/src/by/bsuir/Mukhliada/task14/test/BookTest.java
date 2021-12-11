package by.bsuir.Mukhliada.task14.test;

import by.bsuir.Mukhliada.task12.util.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void checkSort() {
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("A", "Автор1", 10000, 3, 5));
        books.add(new Book("B", "Автор2", 10000, 3, 3));
        books.add(new Book("C", "Автор3", 10000, 3, 2));
        books.add(new Book("D", "Автор4", 10000, 3, 7));
        books.add(new Book("E", "Автор5", 10000, 3, 1));
        books.add(new Book("F", "Автор6", 10000, 3, 0));
        books.add(new Book("G", "Автор7", 10000, 3, 122));

        Collections.sort(books);

        String actual = "";
        String expected = "FECBADG";

        for (Book book : books){
            actual += book.getTitle();
        }

        assertEquals(expected, actual);
    }
}