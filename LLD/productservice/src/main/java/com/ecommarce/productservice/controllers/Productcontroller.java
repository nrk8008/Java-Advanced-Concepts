package com.ecommarce.productservice.controllers;

import com.ecommarce.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")

public class Productcontroller {

    @GetMapping( "/{id}/{temp}")

    public String getProductById(@PathVariable("id") Long id, @PathVariable("temp") String temp){
        return "Here's is your product " + id + " "+temp;
    }

    @PostMapping("")
    public String createProduct(@RequestBody Product product){
        System.out.println(product.getCategory());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        return "Product created." ;
    }
}
