package org.example.petstore.animalerie.repos;

import org.example.petstore.animalerie.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> { }
