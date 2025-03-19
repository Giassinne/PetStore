package animalerie;

import jakarta.persistence.*;
import java.util.List;

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