//Declarar variável de controle de laço dentro de for.
public class ForVar {
    public static void main(String[] args) {
        int soma  = 0;
        int fatorial = 1;

        //Calcula a fatorial dos números até 5
        for(int i = 1; i <= 5; i++){ // A variável i é declarada dentro da instrução for
            soma += i; // i é conhecido em todo o laço
            fatorial *= i;
        }
        //mas não é conhecido aqui (fora do laço)

        System.out.println("Soma é " + soma);
        System.out.println("Fatorial é " + fatorial);
    }
}
