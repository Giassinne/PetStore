/**
 * This package contains constant values used throughout the PetStore application.
 * <p>
 * The constants defined here are primarily used to maintain consistency
 * and avoid hardcoded values in different parts of the system.
 * </p>
 */
package org.example.petstore.animalerie.constants;

/**
 * Utility class that holds constant values used throughout the application.
 * <p>
 * This class contains only static final variables representing various
 * string values that are used within the application. The constructor is
 * private to prevent instantiation of the class.
 * </p>
 * <p>
 * All constants in this class are meant to be accessed statically.
 * </p>
 * * @author Your Name
 * * @version 1.0
 */
public final class Constants {
    public static final double PRICE_PRODUCT_1 = 29.99;
    public static final double PRICE_PRODUCT_2 = 9.99;
    public static final double PRICE_PRODUCT_3 = 14.99;
    public static final String FISH_COLOR_1 = "Rouge";
    public static final String FISH_COLOR_2 = "Bleu";
    public static final String CAT_CHIP_3 = "PUCE003";
    public static final String CAT_COLOR_3 = "Tigré";
    public static final String CAT_CHIP_2 = "PUCE002";
    public static final String CAT_COLOR_2 = "Noir";
    public static final String CAT_CHIP_1 = "PUCE001";
    public static final String CAT_COLOR_1 = "Blanc";
    public static final String NOURRITURE_001 = "NOURRITURE001";
    public static final String ACCESSOIRE_001 = "ACCESSOIRE001";
    public static final String NETTOYAGE_001 = "NETTOYAGE001";
    public static final String COLLIER_POUR_CHAT = "Collier pour Chat";
    public static final String NETTOYANT_POUR_CAGE_D_ANIMAL = "Nettoyant pour Cage d'Animal";
    public static final String CROQUETTES_PREMIUM_POUR_CHATS = "Croquettes Premium pour Chats";
    public static final String LE_MONDE_DES_ANIMAUX = "Le Monde des Animaux";
    public static final String PIERRE_MARTIN = "Pierre Martin";
    public static final String MARIE_DUBOIS = "Marie Dubois";
    public static final String ANIMALERIE_ELEGANTE = "Animalerie Élégante";
    public static final String JEAN_DUPONT = "Jean Dupont";
    public static final String PARADIS_DES_ANIMAUX = "Paradis des Animaux";
    public static final String MARSEILLE = "Marseille";
    public static final String NUMBER = "13001";
    public static final String RUE_DES_POISSONS = "Rue des Poissons";
    public static final String NUMBER1 = "78";
    public static final String LYON = "Lyon";
    public static final String NUMBER2 = "69002";
    public static final String AVENUE_DES_CHATS = "Avenue des Chats";
    public static final String NUMBER3 = "45";
    public static final String PARIS = "Paris";
    public static final String NUMBER4 = "75001";
    public static final String RUE_DES_ANIMAUX = "Rue des Animaux";
    public static final String NUMBER5 = "12";
    public static final String WARNING_MULTIPLE_PRODUCTS_FOUND_WITH_CODE =
            "Warning: Multiple products found with code: {}";

    // Private constructor to prevent instantiation
    private Constants() {
        throw new UnsupportedOperationException("Cannot instantiate Constants class");
    }
}

