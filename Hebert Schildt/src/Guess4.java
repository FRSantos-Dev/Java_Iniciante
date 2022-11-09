public class Guess4 {
    public static void main(String[] args)
        throws java.io.IOException{

        char ch, ignore, answer = 'K';

        do{
            System.out.println("Estou pensando em uma letra em A e Z. ");
            System.out.println("Consegue advinhar? ");

            //lê um caractere
            ch = (char) System.in.read();

            //Descarta qualquer outro caractere do BUFFER de entrada
            do{
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if(ch == answer) System.out.println("** Certo **");
            else{
                System.out.println("...Desculpe, você esta ");
                if (ch < answer)System.out.println("Muito baixo ");
                else System.out.println("Muito alto");
                System.out.println("Tente  de Novo ");
            }
        }while (answer != ch);
    }
}
