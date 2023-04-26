package org.example;

class Product {
    private String name;
    private double price;
    private int grade;

    public Product(String name, double price, int grade) {
        this.name = name;
        this.price = price;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getGrade() {
        return grade;
    }
}
