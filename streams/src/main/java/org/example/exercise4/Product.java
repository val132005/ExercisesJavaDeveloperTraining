package org.example.exercise4;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.awt.*;
import java.util.ArrayList;

public class Product {
    private String code;
    private  String name;
    private String color;
    private Double price;

    public Product(String code, String name, String color, Double price) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    // Se sobreescribe el metodo toString para que sea mas legible
    @Override
    public String toString() {
        return "Code: " + code + "\nName: "+ name + "\nColor: "+color+"\nPrice: "+String.format("%.2f", price)+"\n";
    }


    public static void forEachMethod(){
        // Se crea una lista que va a almacenar objetos de tipo producto
        List<Product> products = new ArrayList<>();
        products.add(new Product("CG-001", "Producto 1", "Azul", 10.99));
        products.add(new Product("CG-002", "Producto 2", "Rojo", 15.99));
        products.add(new Product("CG-003", "Producto 3", "Verde", 5.99));
        products.add(new Product("CG-004", "Producto 4", "Amarillo", 12.99));
        products.add(new Product("CG-005", "Producto 5", "Azul", 8.99));


        //Inicion de bloque de excepcion
        try (FileWriter writer = new FileWriter("productos.txt")) {
            products.stream()
                    .map(Product::toString)
                    .forEach(productString -> {
                        try {
                            writer.write(productString + "\n");
                            System.out.println("aaa");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }








    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
