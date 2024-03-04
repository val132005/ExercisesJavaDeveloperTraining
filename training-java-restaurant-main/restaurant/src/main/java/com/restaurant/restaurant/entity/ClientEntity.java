package com.restaurant.restaurant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity(name = "client")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@ToString
@Builder
public class ClientEntity {

    @Id
    private String document;

    @Column(name = "full_name")
    @NotNull
    private String fullName;

    @Column(unique = true)
    @NotNull
    private String email;

    @Column(unique = true, length = 15)
    @NotNull
    private String cellphone;

    @Column(length = 500)
    @NotNull
    private String address;
}