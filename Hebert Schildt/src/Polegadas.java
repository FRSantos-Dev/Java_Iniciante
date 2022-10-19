/*
    Calcula quantas polegadas cúbicas
    há em uma milha cúbica.
 */

public class Polegadas {
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;

        ci = im *im *im;

        System.out.println("Existem " + ci + "polegadas do cubro em miilha");
    }
}
