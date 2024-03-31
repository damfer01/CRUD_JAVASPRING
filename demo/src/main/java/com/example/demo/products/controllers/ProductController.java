package com.example.demo.products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.products.services.ProductService;
import com.example.demo.products.models.ProductModel;


@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired ProductService productService;

    @PostMapping("/insert")
    public ResponseEntity<ProductModel> insert(@RequestBody ProductModel product){
        return productService.insert(product);
    }
}
