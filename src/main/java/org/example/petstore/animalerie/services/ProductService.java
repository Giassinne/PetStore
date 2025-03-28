package org.example.petstore.animalerie.services;

import org.example.petstore.animalerie.model.Product;
import org.example.petstore.animalerie.repos.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> getProductsByCode(String code) {
        List<Product> products = productRepository.findByCode(code);

        // If multiple products found, you might want to log a warning
        if (products.size() > 1) {
            // Log warning about multiple products with same code
            System.out.println("Warning: Multiple products found with code: " + code);
        }

        // Return the first product if exists
        return products.isEmpty() ? Optional.empty() : Optional.of(products.get(0));
    }
}