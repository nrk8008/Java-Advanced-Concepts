package com.ecommarce.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class GetProductDto {
    private String Title;
    private Double price;
    private String image;
}
