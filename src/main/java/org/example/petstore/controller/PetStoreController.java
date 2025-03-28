package org.example.petstore.controller;

import org.example.petstore.animalerie.model.Animal;
import org.example.petstore.animalerie.repos.AnimalRepository;
import org.example.petstore.animalerie.model.Product;
import org.example.petstore.animalerie.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PetStoreController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private AnimalRepository animalRepository;

    // Récupère tous les produits par code produit
    @GetMapping("/products/{code}")
    public List<Product> getProductsByCode(@PathVariable String code) {
        // Appelle la méthode dans ProductRepository pour récupérer les produits par code
        return productRepository.findByCode(code);
    }

    // Récupère tous les animaux d'une animalerie donnée
    @GetMapping("/animals/{petStoreId}")
    public List<Animal> getAnimalsByPetStoreId(@PathVariable Long petStoreId) {
        // Appelle la méthode dans AnimalRepository pour récupérer les animaux par animalerie
        return animalRepository.findAnimalsByPetStore(petStoreId);
    }
}
