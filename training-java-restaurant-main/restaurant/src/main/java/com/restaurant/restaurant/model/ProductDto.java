package com.restaurant.restaurant.model;

import com.restaurant.restaurant.entity.CategoryProduct;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {
    private String uuid;
    private String name;
    private CategoryProduct category;
    private String description;
    private Double price;
    private Boolean available;



}
