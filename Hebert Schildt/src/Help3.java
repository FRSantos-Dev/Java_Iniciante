/*
Tente iso 3-3
O sistema de ajuda em instruções Java que processa
várias solicitações terminado.
 */
public class Help3 {
    public static void main(String[] args)
        throws java.io.IOException{
        char escolha, ignore;

        for(; ;){
            System.out.println("Help on: ");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while");
            System.out.println(" 6. break" );
            System.out.println(" 7. continue\n");
            System.out.println("Escolha um (q para sair)");

            escolha = (char) System.in.read();

            do{
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (escolha < '1' | escolha > '7' & escolha != 'q');

            if(escolha == 'q') break;

        System.out.println("\n");

        switch (escolha){
            case'1':
                System.out.println("O if: \n");
                System.out.println("if (condição) statement");
                System.out.println("else statement");
                break;
            case '2':
                System.out.println("O switch: \n");
                System.out.println("switch (expressão");
                System.out.println(" case constante: ");
                System.out.println("  statement sequencia");
                System.out.println("     break;");
                System.out.println("    //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("o for: \n");
                System.out.println(" for(inciação; condição; iteração)");
                System.out.println(" statement;");
                break;
            case'4':
                System.out.println("O while: \n");
                System.out.println("while(condição) statement;");
                break;
            case '5':
                System.out.println("O do-while: \n");
                System.out.println("do {");
                System.out.println(" statement;");
                System.out.println("} while (condição);");
                break;
            case '6':
                System.out.println("O break: \n");
                System.out.println("break; ou break rótulo;");
                break;
            case '7':
                System.out.println(" O continue: \n");
                System.out.println(" continue; o continue rótulo;");
                break;
        }
        System.out.println();
    }
}
