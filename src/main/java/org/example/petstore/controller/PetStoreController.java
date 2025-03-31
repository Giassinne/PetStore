package org.example.petstore.controller;

import lombok.RequiredArgsConstructor;
import org.example.petstore.animalerie.model.Animal;
import org.example.petstore.animalerie.model.Product;
import org.example.petstore.animalerie.repos.AnimalRepository;
import org.example.petstore.animalerie.repos.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller for managing the Pet Store API.
 * <p>
 * This controller provides endpoints to retrieve products and animals
 * based on different criteria.
 * </p>
 *
 * <p>Uses {@link ProductRepository} and {@link AnimalRepository} to fetch data.</p>
 *
 * @author Your Name
 * @version 1.0
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PetStoreController {

    private final ProductRepository productRepository;

    private final AnimalRepository animalRepository;

    /**
     * Retrieves a list of products by their product code.
     *
     * @param code The product code to search for.
     * @return A list of {@link Product} objects matching the given code.
     */
    @GetMapping("/products/{code}")
    public List<Product> getProductsByCode(@PathVariable String code) {
        // Appelle la méthode dans ProductRepository pour récupérer les produits par code
        return productRepository.findByCode(code);
    }

    /**
     * Retrieves a list of animals belonging to a specific pet store.
     *
     * @param petStoreId The ID of the pet store.
     * @return A list of {@link Animal} objects belonging to the specified pet store.
     */
    @GetMapping("/animals/{petStoreId}")
    public List<Animal> getAnimalsByPetStoreId(@PathVariable Long petStoreId) {
        // Appelle la méthode dans AnimalRepository pour récupérer les animaux par animalerie
        return animalRepository.findAnimalsByPetStore(petStoreId);
    }
}
