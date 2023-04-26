package org.example.task2;

/**
 *  Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 *  Получить наименования товаров заданного сорта с наименьшей ценой.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", "Russia", 1.0, 10.99, 1));
        products.add(new Product("Product 2", "USA", 1.5, 15.99, 2));
        products.add(new Product("Product 3", "China", 2.0, 20.99, 3));
        products.add(new Product("Product 4", "Germany", 0.5, 5.99, 1));
        products.add(new Product("Product 5", "Japan", 0.8, 8.99, 2));
        products.add(new Product("Product 6", "France", 1.2, 12.99, 3));

        int targetGrade = 2;

        String lowestPriceProductName = "";
        double lowestPrice = Double.MAX_VALUE;

        for (Product product : products) {
            if (product.getGrade() == targetGrade) {
                if (product.getPrice() < lowestPrice) {
                    lowestPrice = product.getPrice();
                    lowestPriceProductName = product.getName();
                }
            }
        }

        if (!lowestPriceProductName.isEmpty()) {
            System.out.println("Наименования товаров заданного сорта с наименьшей ценой " + targetGrade + ": " + lowestPriceProductName);
        } else {
            System.out.println("Нет данных товаров " + targetGrade + ".");
        }

    }

}
