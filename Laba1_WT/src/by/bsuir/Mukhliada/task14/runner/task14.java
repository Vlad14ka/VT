package by.bsuir.Mukhliada.task14.runner;

import by.bsuir.Mukhliada.Print;
import by.bsuir.Mukhliada.task12.util.Book;

import java.util.ArrayList;
import java.util.Collections;

public class task14 {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("LOTR", "Tolkien", 50, 1, 1));
        books.add(new Book("HP&PoA", "Rouling", 40, 1, 2));
        books.add(new Book("Dragon's book", "Ulman", 100, 1, 4));
        books.add(new Book("HP&PS", "Rouling", 40, 1, 6));
        books.add(new Book("HP&OoP", "Rouling", 40, 1, 3));
        books.add(new Book("HP&GoF", "Rouling", 40, 1, 1));

        Print.books(books);

        Collections.sort(books);
        Print.books(books);
    }
}
