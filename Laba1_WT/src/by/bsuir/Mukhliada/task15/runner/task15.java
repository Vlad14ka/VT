package by.bsuir.Mukhliada.task15.runner;

import by.bsuir.Mukhliada.Print;
import by.bsuir.Mukhliada.task12.util.Book;
import by.bsuir.Mukhliada.task15.util.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class task15 {
    public static void main(String[] args) {
        Comparator<Book> titleComparator = Comparators.getTitleComparator();
        Comparator<Book> titleAuthorComparator = Comparators.getTitleAuthorComparator();
        Comparator<Book> authorTitleComparator = Comparators.getAuthorTitleComparator();
        Comparator<Book> allComparator = Comparators.getAllComparators();

        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("LOTR", "Tolkien", 50, 1, 1));
        books.add(new Book("HP&GoA", "B", 40, 1, 2));
        books.add(new Book("Dragon's book", "Ulman", 100, 1, 4));
        books.add(new Book("HP&SC", "D", 41, 1, 6));
        books.add(new Book("HP&SC", "D", 42, 1, 3));
        books.add(new Book("HP&GoA", "A", 45, 1, 1));

        Print.books(books);
        books.sort(titleComparator);
        Print.books(books);

        books.sort(titleAuthorComparator);
        Print.books(books);

        books.sort(authorTitleComparator);
        Print.books(books);

        books.sort(allComparator);
        Print.books(books);
    }
}
