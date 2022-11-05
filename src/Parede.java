/*
Uma parede em formato retangular,
cuja altura é hp (altura da parede) e a largura lp (largura da parede)
precisa ser coberta por azulejos também retangulares.
O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo).
Escreva um programa que leia as quatro medidas hp, lp, ha e la,
calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.
 */

public class Parede {
    public static void main(String[] args) {

        double hp, lp, ha, la, qtd;

        hp = 2.07;
        lp = 3.15;
        ha = 0.25;
        la = 0.32;

        qtd = (hp * lp) / (ha * la);

        System.out.println("A quantidade de azulejos é: " + qtd);
    }
}
