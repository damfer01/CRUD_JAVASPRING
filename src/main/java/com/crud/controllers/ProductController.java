package com.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.domain.ProductRepository;

import lombok.var;

@RestController
@RequestMapping("/product")
public class ProductController {

     @Autowired
    private ProductRepository productRepository ;


    @GetMapping
    public ResponseEntity getAllProducts(){
        var allRepository = productRepository.findAll();
        return ResponseEntity.ok(allRepository);
    }
}
