/**
 * Contains all the classes and interfaces related to the pet store application.
 * <p>
 * This package includes models, repositories, services, enums, constants and controllers
 * to handle the operations related to pet stores, products, and animals.
 * </p>
 *
 * @author Your Name
 * @since 1.0
 */
package org.example.petstore;

import org.example.petstore.animalerie.constants.Constants;
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


/**
 * Main class for the Petstore application.
 * <p>
 * This is the entry point for the Spring Boot application, responsible for launching the application and initializing the database with
 * pet stores, products, and animals.
 * </p>
 *
 * @author Your Name
 * @version 1.0
 */
@SpringBootApplication
public class PetstoreApplication {


    /**
     * Main method to run the Petstore application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(PetstoreApplication.class, args);
    }

    /**
     * Initializes the database with pet stores, products, and animals.
     *
     * @param petStoreRepository Repository for saving pet store data.
     * @param productRepository  Repository for saving product data.
     * @param animalRepository   Repository for saving animal data.
     * @return A CommandLineRunner that will initialize the database.
     */
    @Bean
    CommandLineRunner initDatabase(
            final PetStoreRepository petStoreRepository,
            final ProductRepository productRepository,
            final AnimalRepository animalRepository) {
        return args -> {
            // Create  Addresses
            Address address1 = new Address();
            address1.setNumber(Constants.NUMBER5);
            address1.setStreet(Constants.RUE_DES_ANIMAUX);
            address1.setZipCode(Constants.NUMBER4);
            address1.setCity(Constants.PARIS);

            Address address2 = new Address();
            address2.setNumber(Constants.NUMBER3);
            address2.setStreet(Constants.AVENUE_DES_CHATS);
            address2.setZipCode(Constants.NUMBER2);
            address2.setCity(Constants.LYON);

            Address address3 = new Address();
            address3.setNumber(Constants.NUMBER1);
            address3.setStreet(Constants.RUE_DES_POISSONS);
            address3.setZipCode(Constants.NUMBER);
            address3.setCity(Constants.MARSEILLE);

            // Create  Pet Stores
            PetStore store1 = new PetStore();
            store1.setName(Constants.PARADIS_DES_ANIMAUX);
            store1.setManagerName(Constants.JEAN_DUPONT);
            store1.setAddress(address1);

            PetStore store2 = new PetStore();
            store2.setName(Constants.ANIMALERIE_ELEGANTE);
            store2.setManagerName(Constants.MARIE_DUBOIS);
            store2.setAddress(address2);

            PetStore store3 = new PetStore();
            store3.setName(Constants.LE_MONDE_DES_ANIMAUX);
            store3.setManagerName(Constants.PIERRE_MARTIN);
            store3.setAddress(address3);

            // First, save the pet stores (which should cascade save addresses)
            petStoreRepository.save(store1);
            petStoreRepository.save(store2);
            petStoreRepository.save(store3);

            Product product1 = new Product();
            product1.setCode(Constants.NOURRITURE_001);
            product1.setLabel(Constants.CROQUETTES_PREMIUM_POUR_CHATS);
            product1.setType(ProdType.FOOD);
            product1.setPrice(Constants.PRICE_PRODUCT_1);

            Product product2 = new Product();
            product2.setCode(Constants.ACCESSOIRE_001);
            product2.setLabel(Constants.COLLIER_POUR_CHAT);
            product2.setType(ProdType.ACCESSORY);
            product2.setPrice(Constants.PRICE_PRODUCT_2);


            Product product3 = new Product();
            product3.setCode(Constants.NETTOYAGE_001);
            product3.setLabel(Constants.NETTOYANT_POUR_CAGE_D_ANIMAL);
            product3.setType(ProdType.CLEANING);
            product3.setPrice(Constants.PRICE_PRODUCT_3);


            productRepository.save(product1);
            productRepository.save(product2);
            productRepository.save(product3);

            // Create  Animals
            Cat cat1 = new Cat();
            cat1.setBirth(new Date());
            cat1.setCouleur(Constants.CAT_COLOR_1);
            cat1.setChipId(Constants.CAT_CHIP_1);
            cat1.setPetStore(store1);

            Cat cat2 = new Cat();
            cat2.setBirth(new Date());
            cat2.setCouleur(Constants.CAT_COLOR_2);
            cat2.setChipId(Constants.CAT_CHIP_2);
            cat2.setPetStore(store2);


            Cat cat3 = new Cat();
            cat3.setBirth(new Date());
            cat3.setCouleur(Constants.CAT_COLOR_3);
            cat3.setChipId(Constants.CAT_CHIP_3);
            cat3.setPetStore(store1);


            Fish fish1 = new Fish();
            fish1.setBirth(new Date());
            fish1.setCouleur(Constants.FISH_COLOR_1);
            fish1.setLivingEnv(FishLivEnv.FRESH_WATER);
            fish1.setPetStore(store1);


            Fish fish2 = new Fish();
            fish2.setBirth(new Date());
            fish2.setCouleur(Constants.FISH_COLOR_2);
            fish2.setLivingEnv(FishLivEnv.SEA_WATER);
            fish2.setPetStore(store2);


            Fish fish3 = new Fish();
            fish3.setBirth(new Date());
            fish3.setCouleur(Constants.FISH_COLOR_1);
            fish3.setLivingEnv(FishLivEnv.FRESH_WATER);
            fish3.setPetStore(store3);


            animalRepository.save(cat1);
            animalRepository.save(cat2);
            animalRepository.save(cat3);
            animalRepository.save(fish1);
            animalRepository.save(fish2);
            animalRepository.save(fish3);
        };
    }
}

