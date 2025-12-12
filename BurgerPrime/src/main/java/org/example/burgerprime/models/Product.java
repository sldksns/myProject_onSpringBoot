package org.example.burgerprime.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "products")
@Data
@RequiredArgsConstructor
public class Product {
    @Id
    private Integer id;
    private String name;
    private Double price;
    private String description;
    private String category;
}
