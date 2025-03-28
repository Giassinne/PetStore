package org.example.petstore;

import org.example.petstore.animalerie.enums.FishLivEnv;
import org.example.petstore.animalerie.enums.ProdType;
import org.example.petstore.animalerie.model.*;
import org.example.petstore.animalerie.repos.AnimalRepository;
import org.example.petstore.animalerie.repos.PetStoreRepository;
import org.example.petstore.animalerie.repos.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PetstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetstoreApplication.class, args);
    }
    @Bean
    CommandLineRunner initDatabase(
            PetStoreRepository petStoreRepository,
            ProductRepository productRepository,
            AnimalRepository animalRepository) {
        return args -> {
            // Create French Addresses
            Address address1 = new Address();
            address1.setNumber("12");
            address1.setStreet("Rue des Animaux");
            address1.setZipCode("75001");
            address1.setCity("Paris");

            Address address2 = new Address();
            address2.setNumber("45");
            address2.setStreet("Avenue des Chats");
            address2.setZipCode("69002");
            address2.setCity("Lyon");

            Address address3 = new Address();
            address3.setNumber("78");
            address3.setStreet("Rue des Poissons");
            address3.setZipCode("13001");
            address3.setCity("Marseille");

            // Create French Pet Stores
            PetStore store1 = new PetStore();
            store1.setName("Paradis des Animaux");
            store1.setManagerName("Jean Dupont");
            store1.setAddress(address1);

            PetStore store2 = new PetStore();
            store2.setName("Animalerie Élégante");
            store2.setManagerName("Marie Dubois");
            store2.setAddress(address2);

            PetStore store3 = new PetStore();
            store3.setName("Le Monde des Animaux");
            store3.setManagerName("Pierre Martin");
            store3.setAddress(address3);

            // First, save the pet stores (which should cascade save addresses)
            petStoreRepository.save(store1);
            petStoreRepository.save(store2);
            petStoreRepository.save(store3);

            // Create French Products
            Product product1 = new Product();
            product1.setCode("NOURRITURE001");
            product1.setLabel("Croquettes Premium pour Chats");
            product1.setType(ProdType.FOOD);
            product1.setPrice(29.99);

            Product product2 = new Product();
            product2.setCode("ACCESSOIRE001");
            product2.setLabel("Collier pour Chat");
            product2.setType(ProdType.ACCESSORY);
            product2.setPrice(9.99);


            Product product3 = new Product();
            product3.setCode("NETTOYAGE001");
            product3.setLabel("Nettoyant pour Cage d'Animal");
            product3.setType(ProdType.CLEANING);
            product3.setPrice(14.99);


            productRepository.save(product1);
            productRepository.save(product2);
            productRepository.save(product3);

            // Create French Animals
            Cat cat1 = new Cat();
            cat1.setBirth(new Date());
            cat1.setCouleur("Blanc");
            cat1.setChipId("PUCE001");
            cat1.setPetStore(store1);

            Cat cat2 = new Cat();
            cat2.setBirth(new Date());
            cat2.setCouleur("Noir");
            cat2.setChipId("PUCE002");


            Cat cat3 = new Cat();
            cat3.setBirth(new Date());
            cat3.setCouleur("Tigré");
            cat3.setChipId("PUCE003");


            Fish fish1 = new Fish();
            fish1.setBirth(new Date());
            fish1.setCouleur("Or");
            fish1.setLivingEnv(FishLivEnv.FRESH_WATER);


            Fish fish2 = new Fish();
            fish2.setBirth(new Date());
            fish2.setCouleur("Bleu");
            fish2.setLivingEnv(FishLivEnv.SEA_WATER);


            Fish fish3 = new Fish();
            fish3.setBirth(new Date());
            fish3.setCouleur("Rouge");
            fish3.setLivingEnv(FishLivEnv.FRESH_WATER);


            animalRepository.save(cat1);
            animalRepository.save(cat2);
            animalRepository.save(cat3);
            animalRepository.save(fish1);
            animalRepository.save(fish2);
            animalRepository.save(fish3);
        };
    }
}
