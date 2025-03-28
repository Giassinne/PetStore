package org.example.petstore.animalerie.repos;

import org.example.petstore.animalerie.model.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PetStoreRepository extends JpaRepository<PetStore, Long> {
    Optional<PetStore> findByName(String name);
}
