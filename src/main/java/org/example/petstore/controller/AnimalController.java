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

/**
 * Controller for handling animal-related operations.
 * <p>
 * This controller provides an endpoint to retrieve a list of animals
 * from a specific animalerie (pet store).
 * </p>
 *
 * <p>Uses {@link AnimalService} to fetch data.</p>
 *
 * @author Your Name
 * @version 1.0
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/animaux")
public class AnimalController {

    /**
     * Service for handling business logic related to animals.
     */
    private final AnimalService animalService;


    /**
     * Retrieves a list of animals belonging to a specific animalerie (pet store).
     *
     * @param animalerieId The ID of the animalerie to search for.
     * @return A {@link ResponseEntity} containing:
     * <ul>
     *    <li>HTTP 200 (OK) with a list of {@link Animal} objects if found.</li>
     *    <li>HTTP 204 (No Content) if no animals are found.</li>
     * </ul>
     */
    @GetMapping("/animalerie/{animalerieId}")
    public ResponseEntity<List<Animal>> getAnimalsByAnimalerie(@PathVariable Long animalerieId) {
        List<Animal> animals = animalService.getAnimalsByAnimalerie(animalerieId);
        if (animals.isEmpty()) {
            return ResponseEntity.noContent().build();  // Retourne HTTP 204 si aucun animal n'est trouvé
        }
        return ResponseEntity.ok(animals);  // Retourne HTTP 200 avec la liste des animaux
    }
}

