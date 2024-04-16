package com.ecommarce.productservice.service;

import com.ecommarce.productservice.dtos.GetProductDto;
import com.ecommarce.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

     public GetProductDto getProductById(Long id){
        /*
          call the DB
          call the fake store API
         */
         RestTemplate restTemplate = new RestTemplate();

         String url = "http://fakestoreapi.com/products/" + id;
         Product product = restTemplate.getForObject(url, Product.class);
         //System.out.println(product);

         GetProductDto obj = new GetProductDto();
         assert product != null;
         obj.setTitle(product.getTitle());
         obj.setPrice(product.getPrice());
         obj.setImage(product.getImage());
        return obj;

     }
}
