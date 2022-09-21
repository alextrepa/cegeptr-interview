package cegeptr;

import java.util.Arrays;
import java.util.List;

interface Forme {
    public void imprimeNombreDeCotes();
}

class Carre implements Forme {
    public void imprimeNombreDeCotes() {
        System.out.println(String.format("Un carre a %d cotés.", 4));
    }

}

class Triangle implements Forme {
    public void imprimeNombreDeCotes() {
        System.out.println(String.format("Un triangle a %d cotés.", 3));
    }
}

public class FormePolymorphe {
    /**
     * Ne portez pas attention au constructeur vide.
     */
    private FormePolymorphe() {
    }

    public static void afficheLesCotes() {
        System.out.println("Impression du nombre de cotés des formes polymorphes.");
        Forme carre = new CarrePoly();
        Forme triangle = new TrianglePoly();

        List<Forme> formes = Arrays.asList(carre, triangle);

        for (Forme forme : formes) {
            forme.imprimeNombreDeCotes();
        }
        
        System.out.println();
    }
}
