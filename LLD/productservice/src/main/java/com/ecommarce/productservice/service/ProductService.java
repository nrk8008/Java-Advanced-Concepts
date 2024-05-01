package com.ecommarce.productservice.service;

import com.ecommarce.productservice.dtos.GetProductDto;
import com.ecommarce.productservice.exceptions.NotFoundException;
import com.ecommarce.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

     public GetProductDto getProductById(Long id) throws NotFoundException {
        /*
          call the DB
          call the fake store API
         */
         RestTemplate restTemplate = new RestTemplate();

         String url = "http://fakestoreapi.com/products/" + id;
         Product product = restTemplate.getForObject(url, Product.class);
         System.out.println(product);

         if(product == null){
             throw new NotFoundException();
         }
         return convertToDto(product);

     }

    private static GetProductDto convertToDto(Product product) {
        GetProductDto obj = new GetProductDto();
        //assert product != null;
        obj.setTitle(product.getTitle());
        obj.setPrice(product.getPrice());
        obj.setImage(product.getImage());
        return obj;
    }

    public List<GetProductDto> getAllProducts(){
         RestTemplate restTemplate = new RestTemplate();

         String url = "http://fakestoreapi.com/products/";
         Product[] products = restTemplate.getForObject(url, Product[].class);
         List<GetProductDto> returnedProducts = new ArrayList<>();

         for(Product product: products){
             returnedProducts.add(convertToDto(product));
         }
         return returnedProducts;

     }

}
