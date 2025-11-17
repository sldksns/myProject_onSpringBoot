package org.example.bestsite.interfaces;

import org.example.bestsite.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
