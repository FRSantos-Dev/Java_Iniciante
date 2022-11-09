/*
Tente isto 3-2
Um sistema de ajuda melhorado que usa do-while
para processar uma seleção do menu.
 */
public class Help2 {
    public static void main(String[] args)
        throws java.io.IOException {
        char choice, ignore;

        do{
            System.out.println("Ajuda em: ");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.println(" Escolha um: ");

            choice = (char) System.in.read();

            do{
                ignore = (char) System.in.read();
            }while(ignore != '\n');
        }while (choice < '1' | choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("O f: \n");
                System.out.println("if (condição) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("O switch: \n");
                System.out.println("(expressão) switch {");
                System.out.println("case constante: ");
                System.out.println("       sequencia statement");
                System.out.println("      break;");
                System.out.println("      // .....");
                System.out.println("}");
                break;
            case '3':
                System.out.println("O for: \n");
                System.out.println("for (init; condição; iteração");
                System.out.println(" statement");
                break;
            case'4':
                System.out.println("O while: \n");
                System.out.println("while(condição) statement;");
                break;
            case '5':
                System.out.println("O while: \n");
                System.out.println("do {");
                System.out.println(" statement");
                System.out.println("} while (condição);");
                break;
        }
    }
}
