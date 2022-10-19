/*
        Tente isto 1-2
        Este programa exibe ma tabela de
        conversões de galões em litros
        */

public class GalToLitTable {
    public static void main(String[] args) {
        double galoes, litros;
        int contador;

        contador = 0;
        for(galoes = 1; galoes <= 100; galoes++){
            litros = galoes * 3.7854; // converte para litros
            System.out.println(galoes + "galoes é" +
                    litros + "litros");

            contador++; //<--Incrementa o contador de linhas a cada iteração loop.
            //a cada décima linha, exibe uma linha em branco
            if(contador == 10){        //<--Se o valor do contador for 10, exibe uma linha em branco
                System.out.println();
                contador = 0; //zera o contador de linhas
            }
        }
    }
}
