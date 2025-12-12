package org.example.burgerprime.controllers;

import org.example.burgerprime.interfaces.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.example.burgerprime.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.stereotype.Controller

@RequiredArgsConstructor
public class Controller {

    public final ProductRepository productRepository;


    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/add/product")
    public String addProduct() {
        return "add_product";
    }
    @PostMapping("/add/product")
    public Product addProduct(@RequestBody Product product) {
        System.out.println("Product: " + product);
        return productRepository.save(product);
    }
}
