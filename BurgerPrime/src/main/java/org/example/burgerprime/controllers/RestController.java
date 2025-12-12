package org.example.burgerprime.controllers;

import lombok.RequiredArgsConstructor;
import org.example.burgerprime.interfaces.ProductRepository;
import org.example.burgerprime.models.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
public class RestController {
    public ProductRepository productRepository;

}
