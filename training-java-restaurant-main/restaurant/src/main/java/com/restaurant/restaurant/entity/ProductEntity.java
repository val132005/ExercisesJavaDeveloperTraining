package com.restaurant.restaurant.entity;


import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String uuid;
    @Column(nullable = false, length = 255)
    private String name;
    @Column(nullable = false, length = 50)
    private CategoryProduct category;
    @Column(nullable = false, length = 512)
    private String description;
    @Column(nullable = false, length = 100)
    private Double price;
    @Column(nullable = false, length = 100)
    private Boolean available;
}
