package org.example.petstore.controller;

import jakarta.validation.constraints.Pattern;
import lombok.RequiredArgsConstructor;
import org.example.petstore.animalerie.model.Product;
import org.example.petstore.animalerie.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for managing product-related operations.
 * <p>
 * This controller provides an endpoint to fetch product details based on a product code.
 * </p>
 *
 * <p>Uses {@link ProductService} to retrieve product data.</p>
 *
 * <p>The controller is validated using {@link Validated} to enforce input constraints.</p>
 *
 * @author Your Name
 * @version 1.0
 */
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    /**
     * Service for handling business logic related to products.
     */
    private final ProductService productService;

    /**
     * Retrieves a product based on its unique code.
     *
     * @param code The product code, which must be alphanumeric.
     *             It is validated using a regex pattern to ensure correct format.
     * @return A {@link ResponseEntity} containing:
     * <ul>
     *    <li>HTTP 200 (OK) with the {@link Product} details if found.</li>
     *    <li>HTTP 404 (Not Found) if no product matches the given code.</li>
     * </ul>
     */
    @GetMapping("/code")
    public ResponseEntity<Product> getProductsByCode(@RequestParam @Pattern(regexp = "^[a-zA-Z0-9]+$",
            message = "Invalid code format") final String code) {
        return productService.getProductsByCode(code)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
