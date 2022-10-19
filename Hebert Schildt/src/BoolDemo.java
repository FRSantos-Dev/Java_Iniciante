/*
    Demonstra valores booleanos.
 */

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b é" + b);
        b = true;
        System.out.println("b é" + b);

        //um valor booleano pode controlar a instrução if
        if(b) System.out.println("Isso será executado.");

        b = false;
        if(b) System.out.println("Isso não será executado");

        //o resultado de um operador relaciional é um valor booleano
        System.out.println("10 > 9 é" + (10 > 9 ));
    }
}
