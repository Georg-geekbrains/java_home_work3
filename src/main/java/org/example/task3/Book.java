package org.example.task3;

public class Book {
    private String title;
    private String authorSurname;
    private double price;
    private int yearOfPublication;
    private int numPages;

    public Book(String title, String authorSurname, double price, int yearOfPublication, int numPages) {
        this.title = title;
        this.authorSurname = authorSurname;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
        this.numPages = numPages;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumPages() {
        return numPages;
    }

}
