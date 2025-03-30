package org.example.petstore.animalerie.model;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.example.petstore.animalerie.enums.FishLivEnv;

@Setter
@Getter
@Entity
public class Fish extends Animal {
    private FishLivEnv livingEnv;

}
