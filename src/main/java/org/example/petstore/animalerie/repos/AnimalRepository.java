package org.example.petstore.animalerie.repos;

import org.example.petstore.animalerie.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    @Query("SELECT a FROM Animal a WHERE a.petStore.id = :storeId")
    List<Animal> findAnimalsByPetStore(@Param("storeId") Long storeId);
}

