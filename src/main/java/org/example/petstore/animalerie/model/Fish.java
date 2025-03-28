package org.example.petstore.animalerie.model;
import jakarta.persistence.Entity;
import org.example.petstore.animalerie.enums.FishLivEnv;

@Entity
public class Fish extends Animal {
    private FishLivEnv livingEnv;

    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }
}