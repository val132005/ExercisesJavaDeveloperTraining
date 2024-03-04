package com.restaurant.restaurant.entity;


import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import jakarta.validation.constraints.NotEmpty;



@Entity(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@ToString
@Builder
@EqualsAndHashCode
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 36)
    @NotNull
    private String uuid;

    @Column(unique = true)
    @NotNull
    @NotEmpty
    private String name;

    @Enumerated(EnumType.STRING)
    @NotNull
    private CategoryProduct category;

    @Column(length = 511)
    @NotNull
    private String description;

    @Column
    @NotNull
    private Double price;

    @Column(columnDefinition = "boolean default true", nullable = false)
    private Boolean available;

    @Column(columnDefinition = "boolean default true", nullable = false)
    private Boolean removed;
}