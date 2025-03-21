
package org.example.petstore;


import org.example.petstore.animalerie.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(PetStoreRepository petStoreRepository, ProductRepository productRepository) {
        return args -> {
            // Create products
            Product food = new Product();
            food.setCode("FOOD1");
            food.setLabel("Cat Food");
            food.setType(ProdType.FOOD);
            food.setPrice(19.99);

            Product accessory = new Product();
            accessory.setCode("ACC1");
            accessory.setLabel("Fish Tank");
            accessory.setType(ProdType.ACCESSORY);
            accessory.setPrice(49.99);

            Product cleaning = new Product();
            cleaning.setCode("CLN1");
            cleaning.setLabel("Tank Cleaner");
            cleaning.setType(ProdType.CLEANING);
            cleaning.setPrice(9.99);

            productRepository.saveAll(List.of(food, accessory, cleaning));

            // Create PetStore with Address
            Address address = new Address();
            address.setNumber("123");
            address.setStreet("Pet Street");
            address.setZipCode("12345");
            address.setCity("Pet City");

            PetStore petStore = new PetStore();
            petStore.setName("Happy Pets");
            petStore.setManagerName("John Doe");
            petStore.setAddress(address);
            petStore.setProducts(List.of(food, accessory, cleaning));

            // Create animals
            Cat cat = new Cat();
            cat.setBirth(new Date());
            cat.setCouleur("White");
            cat.setChipId("CHIP123");
            cat.setPetStore(petStore);

            Fish fish = new Fish();
            fish.setBirth(new Date());
            fish.setCouleur("Gold");
            fish.setLivingEnv(FishLivEnv.FRESH_WATER);
            fish.setPetStore(petStore);

            petStore.setAnimals(List.of(cat, fish));

            petStoreRepository.save(petStore);
        };
    }
}