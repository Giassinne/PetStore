package org.example.petstore.animalerie.model;

import jakarta.persistence.Entity;

@Entity
public class Cat extends Animal {
    private String chipId;

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }
}
