🐾 PetStore - Application de Gestion de Produits


📖 Description du Projet
PetStore est une application Spring Boot permettant de gérer les produits d’une animalerie. Elle inclut la gestion des produits, des types de produits et de leur association aux magasins.

⚙️ Prérequis
Avant d’exécuter ce projet, assure-toi d’avoir installé les éléments suivants :

Java 17+

Maven

Spring Boot

Base de données : MySQL, PostgreSQL ou H2

🏗️ Configuration du Projet
📌 Dépendances Principales
Spring Web (pour la gestion des API REST)

Spring Data JPA (pour l’interaction avec la base de données)

Hibernate (ORM pour la gestion des entités)

Jakarta Persistence

📂 Structure du Projet
swift
Copy
Edit
src/main/java/org/example/petstore/
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
🚀 Fonctionnalités
✔️ Recherche de produits par code
✔️ Gestion des types de produits
✔️ Association des produits aux magasins

🛠️ Configuration de la Base de Données
1️⃣ Créer un fichier application.properties
Ajoute la configuration suivante pour connecter ton application à ta base de données :

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/petstore
spring.datasource.username=votre_utilisateur
spring.datasource.password=votre_mot_de_passe
spring.jpa.hibernate.ddl-auto=update
🔗 API Endpoints
Méthode	Endpoint	Description
GET	/products/code?code=XYZ	Recherche un produit par son code
🏃‍♂️ Commandes Maven
💻 Compiler le projet

sh
Copy
Edit
mvn clean install
🚀 Lancer l'application

sh
Copy
Edit
mvn spring-boot:run
⚠️ Gestion des Erreurs
Produit non trouvé → Géré avec des réponses HTTP adaptées.

Contrainte d'unicité sur le code produit → Empêche les doublons en base de données.

👥 Contribution
Tu veux contribuer ? Suis ces étapes :

Fork le projet

Crée une branche (feature/ma_fonctionnalité)

Commit tes modifications

Push et crée une Pull Request

🎯 Améliorations Possibles
🔹 Ajout de tests unitaires avec JUnit & Mockito

🔹 Sécurisation des endpoints avec Spring Security

🔹 Documentation interactive avec Swagger
