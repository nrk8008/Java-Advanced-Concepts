package com.ecommarce.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private Long id;
    private String Title;
    private String description;
    private Double price;
    private String image;
    private String category;
    private String seller;

}

