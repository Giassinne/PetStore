package org.example.petstore.animalerie.Repos;

import org.example.petstore.animalerie.ProdType;
import org.example.petstore.animalerie.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByType(ProdType type);
}
