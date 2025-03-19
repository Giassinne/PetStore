package animalerie;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String label;

    @Enumerated(EnumType.STRING)
    private ProdType type;
}