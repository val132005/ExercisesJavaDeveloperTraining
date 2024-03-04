package com.restaurant.restaurant.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity(name = "order_entity")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String uuid;

    @Column
    @NotNull
    private Integer quantity;

    @Column(name = "info_additional", length = 511)
    private String infoAdditional;

    @Column(name = "sub_total")
    @NotNull
    private Double subTotal;

    @Column
    @NotNull
    private Double tax;

    @Column
    @NotBlank
    private Double total;

    @Column(columnDefinition = "boolean default false")
    @NotNull
    private Boolean ordered;

    @Column(name = "date_ordered")
    @NotNull
    private Date dateOrdered;

    @Column(name = "date_order")
    @NotNull
    private Date dateOrder;

    //relation
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_document")
    private ClientEntity documentClient;

    //relation
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_uuid", referencedColumnName = "uuid")
    private ProductEntity uuidProduct;

}