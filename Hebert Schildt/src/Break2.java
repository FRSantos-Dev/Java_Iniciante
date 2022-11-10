//Lê a entrada até  um q ser recebido.
public class Break2 {
    public static void main(String[] args)
        throws java.io.IOException {

            char ch;
            for(; ; ) { //Laço infinito
                ch = (char) System.in.read(); // obtém um char
                if(ch == 'q') break; //Laço infinito é encerrado  por break.
            }
            System.out.println("Você pressionou q! ");
        }
    }

