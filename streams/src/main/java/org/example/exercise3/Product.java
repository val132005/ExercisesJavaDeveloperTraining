package org.example.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private String name;
    private String color;
    private double price;

    public Product(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }


    public static void filterMethod(){
        // Creacion del arreglo
        List<Product> products = new ArrayList<>();
        //Adicion de objetos de tipo Product al arreglo
        products.add(new Product("Product 1", "Blue", 10.99));
        products.add(new Product("Product 2", "Red", 15.99));
        products.add(new Product("Product 3", "Green", 5.99));
        products.add(new Product("Product 4", "Yellow", 12.99));
        products.add(new Product("Product 5", "Blue", 8.99));

        // Nueva lista de tipo Product que recibira unicamente ciertos productos
        List<Product> filteredProducts = products.stream()
                // Se filtran solo los productos de color Blue, Res, Yellow
                .filter(product -> product.getColor().equals("Blue") ||
                        product.getColor().equals("Red") ||
                        product.getColor().equals("Yellow"))
                // Se agregan los lementos a la lista
                .collect(Collectors.toList());

        // Se crea una nueva lista para aplicar u mejor formato al resultado de los condicionales
        List<String> productsInfoList = filteredProducts.stream()
                .map(product -> "Name: " + product.getName() +
                        ", Color: " + product.getColor() +
                        ", Price: " + product.getPrice())
                // Se agregan los resultados a la lista
                .toList();


        productsInfoList.forEach(System.out::println);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
