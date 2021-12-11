package by.bsuir.Mukhliada.task12.runner;

import by.bsuir.Mukhliada.task12.util.Book;

public class task12 {
    public static void main(String[] args) {
        Book book1 = new Book("LOTR", "Tolkien", 20, 1);
        Book book2 = new Book("LOTR", "Tolkien", 20, 1);
        Book book3 = new Book("Harry Potter", "Rouling", 10, 1);

        System.out.println(book1.toString());
        System.out.println();
        System.out.println(book2.toString());
        System.out.println();
        System.out.println(book3.toString());
        System.out.println();

        System.out.println("Book1 == Book1: " + book1.equals(book1));
        System.out.println("Book1 == Book2: " + book1.equals(book2));
        System.out.println("Book1 == Book3: " + book1.equals(book3));
        System.out.println("Book2 == Book3: " + book2.equals(book3));
        System.out.println();

        System.out.println("Book1 hash: " + book1.hashCode());
        System.out.println("Book2 hash: " + book2.hashCode());
        System.out.println("Book3 hash: " + book3.hashCode());
        System.out.println();

    }
}
