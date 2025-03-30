package org.example.petstore.animalerie.services;

import org.example.petstore.animalerie.constants.Constants;
import org.example.petstore.animalerie.model.Product;
import org.example.petstore.animalerie.repos.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> getProductsByCode(String code) {
        List<Product> products = productRepository.findByCode(code);

        // If multiple products found, you might want to log a warning
        if (products.size() > 1) {
            // Log warning about multiple products with same code
            logger.warn(Constants.WARNING_MULTIPLE_PRODUCTS_FOUND_WITH_CODE, code);
        }

        // Return the first product if exists
        return products.isEmpty() ? Optional.empty() : Optional.of(products.get(0));
    }
}