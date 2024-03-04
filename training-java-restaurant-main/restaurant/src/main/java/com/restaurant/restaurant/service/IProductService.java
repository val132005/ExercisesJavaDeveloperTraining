package com.restaurant.restaurant.service;

import com.restaurant.restaurant.entity.ProductEntity;
import com.restaurant.restaurant.model.ProductDto;

import java.util.List;

public interface IProductService {

    List<ProductDto> findAllProducts();
    public ProductEntity findById(Long id);
}
