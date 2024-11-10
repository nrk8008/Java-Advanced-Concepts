package com.ecommarce.productservice.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

import static java.awt.font.TransformAttribute.IDENTITY;

@Getter
@Setter
// telling hibernate to create a table in MySQL database
@MappedSuperclass
@Entity(name = "ecomm_user")
public final class User {
    @Id
    @GeneratedValue

    private UUID id;
         // "id": "f842f1e6-dea8-4f46-8cdf-d8bfcd995eb1",
         // created through Postman POST request.

    private String name;
    @Column(name = "email_address", unique = true)
    private String email;
}
