package org.example.petstore.animalerie.repos;

import org.example.petstore.animalerie.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCode(String code);  // Changed to return a list
}

