package org.example.bestsite.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Column(name = "p_name")
    private String name;
    @Column(name = "p_price")
    private double price;
    @Column(name = "p_description")
    private String description;
    @Column(name = "p_author")
    private String author;
    @Id
    @GeneratedValue
    private Integer ID;
}
