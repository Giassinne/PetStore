package org.example.petstore.animalerie.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity

public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String managerName;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @ManyToMany
    private List<Product> products;

    @OneToMany(mappedBy = "petStore", cascade = CascadeType.ALL)
    private List<Animal> animals;

}
