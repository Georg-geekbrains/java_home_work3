package org.example.task3;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
 * и год издания после 2010 г, включительно.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book 1", "Smith", 9.99, 2012, 150));
        books.add(new Book("Book 2", "Johnson", 14.99, 2008, 250));
        books.add(new Book("Book 3", "Anderson", 12.99, 2015, 200));
        books.add(new Book("Book 4", "Brown", 7.99, 2019, 100));
        books.add(new Book("Book 5", "Adams", 11.99, 2011, 180));
        books.add(new Book("Book 6", "Taylor", 8.99, 2018, 120));

        String targetAuthorSurname = "A";
        int targetYearOfPublication = 2010;


        for (Book book : books) {
            if (book.getNumPages() % 2 == 0 && book.getAuthorSurname().contains(targetAuthorSurname) && book.getYearOfPublication() >= targetYearOfPublication) {
                System.out.println("Книги с заданными параметрами: " + book.getTitle());
            }
        }
    }
}
