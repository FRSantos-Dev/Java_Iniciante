import javax.swing.*;

public class Guess_3 {
    public static void main(String[] args)
            throws java.io.IOException{

        char ch, resposta = 'K';

        System.out.println("Estou pensando em uma letra entre A e Z");
        System.out.println("Consegue advinhar: ");

        ch = (char) System.in.read(); //obtém um char

        if (ch == resposta) System.out.println("**Certo**");
        else{
            System.out.println("...Desculpe, você esta ");

            // um 'if' aninhado
            if(ch < resposta) System.out.println("muito baixo");
            else System.out.println("muito alto");
        }
    }
}
