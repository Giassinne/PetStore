package org.example.petstore.animalerie.services;

import lombok.RequiredArgsConstructor;
import org.example.petstore.animalerie.constants.Constants;
import org.example.petstore.animalerie.model.Product;
import org.example.petstore.animalerie.repos.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for handling business logic related to products.
 * <p>
 * This service provides functionality to retrieve a product by its unique code.
 * </p>
 *
 * <p>Uses {@link ProductRepository} for database operations.</p>
 *
 * <p>Logs a warning if multiple products are found with the same code.</p>
 *
 * @author Your Name
 * @version 1.0
 */
@Service
@RequiredArgsConstructor
public class ProductService {

    /**
     * Repository for accessing product data.
     */
    private final ProductRepository productRepository;

    /**
     * Logger instance for logging important service-level information.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

    /**
     * Retrieves a product based on its unique code.
     *
     * @param code The product code used to search for the product.
     * @return An {@link Optional} containing:
     * <ul>
     *     <li>The first {@link Product} found, if available.</li>
     *     <li>An empty {@link Optional} if no product matches the given code.</li>
     * </ul>
     * @implNote If multiple products are found with the same code, a warning is logged.
     */
    public Optional<Product> getProductsByCode(final String code) {
        List<Product> products = productRepository.findByCode(code);

        // If multiple products found, you might want to log a warning
        if (products.size() > 1) {
            // Log warning about multiple products with same code
            LOGGER.warn(Constants.WARNING_MULTIPLE_PRODUCTS_FOUND_WITH_CODE);
        }

        // Return the first product if exists
        return products.isEmpty() ? Optional.empty() : Optional.of(products.get(0));
    }
}

