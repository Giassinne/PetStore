package org.example.petstore.animalerie.services;

import org.example.petstore.animalerie.model.Animal;
import org.example.petstore.animalerie.repos.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> getAnimalsByAnimalerie(Long animalerieId) {
        return animalRepository.findAnimalsByPetStore(animalerieId);
    }
}
