🌳 Структура
src/
 ├── model/
 │     └── Product.java
 └── Main.java

 
📄 1. Модель (объект)
package model;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
📄 2. Метод + Stream API
import model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("A", 100),
                new Product("B", 200),
                new Product("C", 300)
        );

        int sum = products.stream()
                .collect(Collectors.summingInt(Product::getPrice));

        System.out.println("Сумма: " + sum);
    }
}