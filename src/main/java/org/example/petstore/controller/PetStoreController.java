package controller;

import animalerie.Animal;
import animalerie.ProdType;
import animalerie.Product;
import Repos.AnimalRepository;
import Repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PetStoreController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/products/{code}")
    public List<Product> getProductsByCode(@PathVariable String code) {
        return productRepository.findByType(ProdType.ACCESSORY);
    }

    @GetMapping("/animals/{petStoreId}")
    public List<Animal> getAnimalsByPetStoreId(@PathVariable Long petStoreId) {
        return animalRepository.findAnimalsByPetStore(petStoreId);
    }
}