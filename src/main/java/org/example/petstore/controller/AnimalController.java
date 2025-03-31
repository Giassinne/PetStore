package org.example.petstore.controller;

import lombok.RequiredArgsConstructor;
import org.example.petstore.animalerie.model.Animal;
import org.example.petstore.animalerie.services.AnimalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/animaux")
public class AnimalController {

    private final AnimalService animalService;
    
    @GetMapping("/animalerie/{animalerieId}")
    public ResponseEntity<List<Animal>> getAnimalsByAnimalerie(@PathVariable Long animalerieId) {
        List<Animal> animals = animalService.getAnimalsByAnimalerie(animalerieId);
        if (animals.isEmpty()) {
            return ResponseEntity.noContent().build();  // Retourne HTTP 204 si aucun animal n'est trouvé
        }
        return ResponseEntity.ok(animals);  // Retourne HTTP 200 avec la liste des animaux
    }
}
