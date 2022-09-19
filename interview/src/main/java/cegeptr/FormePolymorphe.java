package cegeptr;

import java.util.Arrays;
import java.util.List;

interface Forme {
    public void imprimeNombreDeCotes();
}

class Carre implements Forme {
    public void imprimeNombreDeCotes() {
        System.out.println(String.format("Un carre a %d cotes.", 4));
    }

}

class Triangle implements Forme {
    public void imprimeNombreDeCotes() {
        System.out.println(String.format("Un triangle a %d cotes.", 3));
    }
}

public class FormePolymorphe {
    /**
     * Ne portez pas attention au constructeur vide.
     */
    private FormePolymorphe() {
    }

    public static void afficheLesCotes() {
        System.out.println("Impression du nombre de cotes des formes polymorphes.");
        Forme carre = new Carre();
        Forme triangle = new Triangle();

        List<Forme> formes = Arrays.asList(carre, triangle);

        for (Forme forme : formes) {
            forme.imprimeNombreDeCotes();
        }
        System.out.println();
    }
}
