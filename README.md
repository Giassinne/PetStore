# 🐾 PetStore - Application de Gestion de Produits  

## 📖 Description du Projet  
PetStore est une application **Spring Boot** permettant de gérer les produits d’une animalerie.  

## ⚙️ Prérequis  
- **Java 17+**  
- **Maven**  
- **Spring Boot**  
- **Base de données** : MySQL, PostgreSQL ou H2  

## 🏗️ Configuration du Projet  

### 📌 Dépendances Principales  
- **Spring Web**  
- **Spring Data JPA**  
- **Hibernate**  
- **Jakarta Persistence**  

## 📂 Structure du Projet  

```bash
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
```

### 📌 Configuration MySQL
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/petstore
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
