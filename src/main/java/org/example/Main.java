package org.example;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Product 1", 10.99, 1),
                new Product("Highest Product 1", 29.99, 1),
                new Product("Product 2", 15.99, 2),
                new Product("Highest Product 2", 39.99, 2),
                new Product("Product 3", 20.99, 3)
        };
        double highestPrice = Double.MIN_VALUE;

        for (Product product : products) {
            if (product.getName().contains("Highest") && (product.getGrade() == 1 || product.getGrade() == 2)) {
                if (product.getPrice() > highestPrice) {
                    highestPrice = product.getPrice();
                }
            }
        }
        System.out.println("Наибольшая цена товаров 1го или 2го сорта, название которых содержит \"Высший\": $" + highestPrice);
    }
}