package com.ecommarce.productservice.controllers;
import com.ecommarce.productservice.dtos.GetProductDto;
import com.ecommarce.productservice.models.Product;
import com.ecommarce.productservice.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class Productcontroller {

    private ProductService productService;
    public Productcontroller(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping( "/{id}")
    public @ResponseBody GetProductDto  getProductById(
            @PathVariable("id") Long id)throws Exception{
        return productService.getProductById(id);
    }

    @GetMapping(" ")
    public @ResponseBody List<GetProductDto> getAllProducts(){
        return productService.getAllProducts();
    }


    @PostMapping("")
    public String createProduct(@RequestBody Product product){
        System.out.println(product.getTitle());
        System.out.println(product.getCategory());
        System.out.println(product.getPrice());
        return "Product created." ;
    }
}
