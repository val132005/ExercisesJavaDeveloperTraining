package com.restaurant.restaurant.repository;

import com.restaurant.restaurant.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IProductRepository extends JpaRepository<ProductEntity, Long> {


    //List<ProductEntity> findAllProducts();
    List<ProductEntity> productEntityList = null;

    /*
    @Override
    public List<ProductEntity> findAllProducts() {
        return productEntityList;
    }
    /
     */
    List<ProductEntity> findByPrice(Double price);

    Optional<ProductEntity> findById(Long id);

/*
    @PostConstruct
    public void init(){
        productEntityList = List.of(
                ProductEntity.builder()
                        .id(1L)
                        .name("Pizza")
                        .uuid(UUID.randomUUID().toString())
                        .description("Pizza de piña")
                        .category(CategoryProduct.MEATS)
                        .price(15000.0)
                        .available(true)
                        .build(),
                ProductEntity.builder()
                        .id(2L)
                        .name("Hamburguesa")
                        .uuid(UUID.randomUUID().toString())
                        .description("Desc2")
                        .category(CategoryProduct.HAMBURGERS_AND_HOTDOGS)
                        .price(7000.0)
                        .available(true)
                        .build(),
                ProductEntity.builder()
                        .id(3L)
                        .name("Papas")
                        .uuid(UUID.randomUUID().toString())
                        .description("Desc3")
                        .category(CategoryProduct.FISH)
                        .price(10000.0)
                        .available(true)
                        .build()
        );
    }

 */

}
