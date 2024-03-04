package com.restaurant.restaurant.mapper;

import com.restaurant.restaurant.entity.CategoryProduct;
import com.restaurant.restaurant.entity.ProductEntity;
import com.restaurant.restaurant.model.ProductDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductEntityToDtoMapper implements Converter<ProductEntity, ProductDto> {
    public static ProductDto mapToDTO(ProductEntity productEntity){
        ProductDto dto = new ProductDto();
        dto.setName(productEntity.getName());
        dto.setCategory(productEntity.getCategory());
        dto.setDescription(productEntity.getDescription());
        dto.setPrice(productEntity.getPrice());
        dto.setAvailable(productEntity.getAvailable());
        return dto;

    }

    public static List<ProductDto> mapListToDTO(List<ProductEntity> productEntityList){
        return productEntityList.stream()
                .map(ProductEntityToDtoMapper::mapToDTO)
                .toList();




    }

    @Override
    public ProductDto convert(ProductEntity source) {
        return source==null
                ? null
                : ProductDto
                .builder()
                .uuid(source.getUuid())
                .name(source.getName())
                .description(source.getName())
                .category(source.getCategory())
                .price(source.getPrice())
                .available(source.getAvailable())
                .build();
    }
}
