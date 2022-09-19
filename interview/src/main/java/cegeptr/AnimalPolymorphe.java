package cegeptr;

interface Animal {
    public void imprimeLeCri();
}

/**
 * Implémentez au moin 5 animaux.
 * Les animaux doivent être les mêmes que dans la classe des animaux non polymorphe.
 * Les animaux doivent implementer l'interface Animal dans ce fichier.
 */

public class AnimalPolymorphe {
    /**
     * Ne portez pas attention au constructeur vide.
     */
    private AnimalPolymorphe() {
    }

    public static void afficherLesCris() {
        System.out.println("Impression du cris des animaux polymorphes.");

        /**
         * Implémentez la logique du cri des animaux ici
         * Le résultat devrait ressmebler à:
         * Le <nom de l'animal> fait le cri suivant: <cri de l'animal>.
         * Donc si on a un chat, on aurait le résultat suivant:
         * Le chat fait le cri suivant: Meow.
         */

        System.out.println();
    }
}