package cegeptr;

interface Animal {
    public void imprimeLeCri();
}

/**
 * Implémentez au moins 5 animaux.
 * Les animaux doivent être les mêmes que dans la classe des animaux non-polymorphes.
 * Les animaux doivent implémenter l'interface <<Animal>> dans ce fichier.
 */

public class AnimalPolymorphe {
    /**
     * Ne portez pas attention au constructeur vide.
     */
    private AnimalPolymorphe() {
    }

    public static void afficherLesCris() {
        System.out.println("Impression du cri des animaux polymorphes.");

        /**
         * Implémentez la logique du cri des animaux ici.
         * Le résultat devrait ressembler à:
         * 
         * Le <nom de l'animal> fait le cri suivant: <cri de l'animal>.
         * 
         * Donc si on a un chat, on aurait le résultat suivant:
         * 
         * Le chat fait le cri suivant: Meow.
         */

        System.out.println();
    }
}
