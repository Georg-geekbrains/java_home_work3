package org.example.task2;

public class Product {
    private String name;
    private String country;
    private double weight;
    private double price;
    private int grade;

    public Product(String name, String country, double weight, double price, int grade) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getGrade() {
        return grade;
    }
}
