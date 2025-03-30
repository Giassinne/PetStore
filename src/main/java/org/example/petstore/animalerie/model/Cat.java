package org.example.petstore.animalerie.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Cat extends Animal {
    private String chipId;

}

