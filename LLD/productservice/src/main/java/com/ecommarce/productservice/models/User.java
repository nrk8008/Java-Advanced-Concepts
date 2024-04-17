package com.ecommarce.productservice.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import static java.awt.font.TransformAttribute.IDENTITY;

@Getter
@Setter
// telling hibernate to create a table in MySQL database
@Entity(name = "ecomm_user")
public final class User {
    @Id
   //@GeneratedValue(strategy = IDENTITY)

    private Long id;
    private String name;
   // @Column(name = "email", unique = true)
    private String email;
}
