package com.globant.training.sampledto.controller;

public class Main {
    public static void main(String[] args) {
        //Product p  = new  Product(1L, "Combo", 12.45D, true);


        Product p = Product.builder()
                .id(1L)
                .name("Combo")
                .price(12.45D)
                .active(true)
                .build();

        System.out.println("Product: "+p.toString());

        System.out.println("Product: "+p);

    }
}
