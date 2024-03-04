package com.restaurant.restaurant.service;

import com.restaurant.restaurant.entity.ProductEntity;
import com.restaurant.restaurant.mapper.ProductEntityToDtoMapper;
import com.restaurant.restaurant.model.ProductDto;
import com.restaurant.restaurant.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService{
    @Autowired
    IProductRepository productRepository;

    @Autowired
    ProductEntityToDtoMapper productEntityToDtoMapper;

    //ProductRepository productRepository = null;

    public ProductServiceImpl(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDto> findAllProducts() {
        return productRepository
                .findAll()
                .stream()
                .map(p -> productEntityToDtoMapper.convert(p))
                .toList();

    }

    @Override
    public ProductEntity findById(Long id) {
        return null;
    }

    Optional<ProductEntity> findProductById(Long id){
        return productRepository.findById(id);
    }
}
