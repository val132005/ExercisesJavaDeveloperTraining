package com.restaurant.restaurant.controller;

import com.restaurant.restaurant.model.ProductDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface IProductController {
    @GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<ProductDto>> findAllProducts();

}
