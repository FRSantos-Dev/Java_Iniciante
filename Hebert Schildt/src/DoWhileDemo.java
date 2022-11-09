public class DoWhileDemo {
    public static void main(String[] args)
        throws java.io.IOException{

            char ch;
                do{
                System.out.println("pressiona uma tecla seguida de ENTER: ");
                ch = (char) System.in.read(); // obtém um char -- convertendo com (cast)
            }
            while(ch != 'q'); //Contnuar executando em quanto a tecla digitada for diferente de q

    }
}
