package com.ecommarce.productservice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

@Entity
@Getter
@Setter

public class Instructor extends SecurityProperties.User {

    private double salary;
    private String skill;


}
