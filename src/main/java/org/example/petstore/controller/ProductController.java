package org.example.petstore.controller;

import org.example.petstore.animalerie.model.Product;
import org.example.petstore.animalerie.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/code")
    public ResponseEntity<Product> getProductsByCode(@RequestParam String code) {
        return productService.getProductsByCode(code)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}