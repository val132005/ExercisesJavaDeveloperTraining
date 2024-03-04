package com.restaurant.restaurant.controller;

import com.restaurant.restaurant.controller.IProductController;
import com.restaurant.restaurant.entity.ProductEntity;
import com.restaurant.restaurant.mapper.ProductEntityToDtoMapper;
import com.restaurant.restaurant.model.ProductDto;
import com.restaurant.restaurant.service.IProductService;
import com.restaurant.restaurant.service.ProductServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
//@NoArgsConstructor
@RequestMapping("/product")
public class ProductControllerImpl implements IProductController {


    @Autowired
    IProductService productService;


    @GetMapping(path = {"/{id}"})
    public ProductDto getProduct(@PathVariable Long id){
        ProductEntity productEntity = productService.findById(id);
        return ProductEntityToDtoMapper.mapToDTO(productEntity);

    }

    @Override
    public ResponseEntity<List<ProductDto>> findAllProducts() {
        return ResponseEntity.ok(productService.findAllProducts());
    }
}
