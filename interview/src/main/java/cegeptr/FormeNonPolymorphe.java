package cegeptr;

class Carre {
    public int nombreDeCotes() {
        return 4;
    }

}

class Triangle {
    public void imprimeNombreCote() {
        System.out.println(String.format("Un triangle a %d cotes.", 3));
    }
}

public class FormeNonPolymorphe {
    /**
     * Ne portez pas attention au constructeur vide.
     */
    private FormeNonPolymorphe() {
    }

    public static void afficheLesCotes() {
        System.out.println("Impression du nombre de cotes des formes non polymorphes.");

        Carre carre = new Carre();
        Triangle triangle = new Triangle();

        System.out.println(String.format("Un carre a %d cotes.", carre.nombreDeCotes()));
        triangle.imprimeNombreCote();
    }
}
