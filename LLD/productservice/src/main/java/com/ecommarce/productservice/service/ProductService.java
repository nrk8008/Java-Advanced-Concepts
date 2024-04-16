package com.ecommarce.productservice.service;

import com.ecommarce.productservice.dtos.GetProductDto;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

     public GetProductDto getProductById(Long id){
        /*
          call the DB
          call the fake store API
         */

         GetProductDto obj = new GetProductDto();
         obj.setName("I PHONE");
         obj.setPrice(120000.0);
         obj.setImageUrl("www.apple.com");
        return obj;
    }
}
