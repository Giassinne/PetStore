package org.example.petstore.animalerie.services;

import lombok.RequiredArgsConstructor;
import org.example.petstore.animalerie.model.Animal;
import org.example.petstore.animalerie.repos.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class responsible for handling business logic related to animals.
 * <p>
 * This service provides functionality to retrieve animals associated with a specific pet store (animalerie).
 * </p>
 *
 * <p>Uses {@link AnimalRepository} to interact with the database.</p>
 *
 * @author Your Name
 * @version 1.0
 */
@Service
@RequiredArgsConstructor
public class AnimalService {

    /**
     * Repository for accessing animal data.
     */
    private final AnimalRepository animalRepository;

    /**
     * Retrieves a list of animals belonging to a specific pet store (animalerie).
     *
     * @param animalerieId The ID of the pet store (animalerie) for which animals should be retrieved.
     * @return A {@link List} of {@link Animal} objects associated with the given pet store.
     * Returns an empty list if no animals are found.
     */
    public List<Animal> getAnimalsByAnimalerie(Long animalerieId) {
        return animalRepository.findAnimalsByPetStore(animalerieId);
    }
}


