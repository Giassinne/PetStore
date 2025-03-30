package org.example.petstore.animalerie.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.petstore.animalerie.enums.ProdType;

@Setter
@Getter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String label;
    private double price;

    @Enumerated(EnumType.STRING)
    private ProdType type;
}
