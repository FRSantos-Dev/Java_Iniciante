/*Criar um programa que calcule a média de salários de uma empresa,
pedindo ao usuário a grade de funcionários e os salários,
e devolvendo a média salarial.

 */
public class MediaSalario {
    public static void main(String[] args) {
        double colaborador1, colaborador2, colaborador3, colaborador4, media;

        colaborador1 = 1200.86;
        colaborador2 = 3524.27;
        colaborador3 = 8953.71;
        colaborador4 = 1524.25;

        media = (colaborador1 + colaborador2 + colaborador3 + colaborador4) / 4;

        System.out.println(" A média de sálarios é R$: " + media);

    }
}
