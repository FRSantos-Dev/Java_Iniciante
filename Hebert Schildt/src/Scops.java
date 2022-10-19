public class Scops {
    public static void main(String[] args) {

        int n, d, q;

        n = 10;
        d = 2;
        if(d != 0 && (n % d) == 0)
            System.out.println(d + "é o fator de " + n);

        d = 0; // configurando d com zero

        //Já que d é igual a zero, o segundo operando não vai ser avaliado.
        if (d != 0 && (n % d) == 0) // Operador de curto-circuito impede a divisão por zero.
            System.out.println(d + "é o fator de " + n);
        /*
        Tentando a mesma coisa sem o operador de curto-circuito.
        Isso causará um erro de diivisão por zero.
         */
        if (d != 0 & (n % d) == 0)
            System.out.println( d + "é fator de " + n);

    }
}
