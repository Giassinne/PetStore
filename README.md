Description du Projet
Ce projet Spring Boot est une application de gestion de produits pour une animalerie, permettant de gérer les produits, les types de produits et les magasins pour animaux.
Prérequis

Java 17+
Maven
Spring Boot
Base de données (MySQL, PostgreSQL, ou H2)

Configuration du Projet
Dépendances Principales

Spring Web
Spring Data JPA
Hibernate
Jakarta Persistence

Structure du Projet
Copysrc/main/java/org/example/petstore/
├── animalerie/
│   ├── model/
│   │   ├── Product.java
│   │   ├── PetStore.java
│   │   └── enums/
│   │       └── ProdType.java
│   ├── repos/
│   │   └── ProductRepository.java
│   └── services/
│       └── ProductService.java
└── controller/
    └── ProductController.java
Fonctionnalités

Recherche de produits par code
Gestion des types de produits
Association des produits aux magasins

Configuration de la Base de Données

Créez un fichier application.properties
Configurez la connexion à votre base de données
Activez la création automatique des tables

Exemple de Configuration
propertiesCopyspring.datasource.url=jdbc:mysql://localhost:3306/petstore
spring.datasource.username=votre_utilisateur
spring.datasource.password=votre_mot_de_passe
spring.jpa.hibernate.ddl-auto=update
API Endpoints

GET /products/code: Rechercher un produit par son code

Commandes Maven

Compiler le projet : mvn clean install
Lancer l'application : mvn spring-boot:run

Gestion des Erreurs

Gestion des produits non trouvés
Contraintes d'unicité sur le code produit

Contribution

Forkez le projet
Créez une branche de fonctionnalité
Commitez vos modifications
Pushez et créez une Pull Request
