package com.globant.training.sampledto.controller;

import lombok.*;


@Builder
@Data // Love you
public class Product {
    private Long id;
    private String name;
    private Double price;
    private Boolean active;


}
