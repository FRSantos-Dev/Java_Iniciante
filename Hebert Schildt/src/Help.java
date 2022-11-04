/*Este projeto constrói um sistema de ajuda simples que exibe a sintaxe das instruções de controle Java.
O programa exibe um menu contendo as instruções de controle e então espera que uma seja selecionada.
Apos a seleção, a sintaxe da instrução é exbidia. Nessa primeira versão do prgrama, só há ajuda disponível para
 as instruções if e switch. As outras instruções de controle serão adicionados em projetos subsequentes.*/

import org.w3c.dom.ls.LSOutput;

//Tente isto 3-1. Umsistema de ajuda simples.
public class Help {
    public static void main(String[] args)
        throws java.io.IOException {
            char escolha;

            System.out.println("Help on: ");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println("Choose one:");
            escolha = (char) System.in.read();

            System.out.println("\n");

            switch (escolha) {
                case '1' :
                    System.out.println("O if: \n");
                    System.out.println("if (condição) statement;");
                    System.out.println("else statement");
                    break;

                case '2' :
                    System.out.println("O switch: \n");
                    System.out.println("switch (expression){");
                    System.out.println(" case constant: ");
                    System.out.println(" statement sequence");
                    System.out.println("  break;");
                    System.out.println("// ....");
                    System.out.println("}");
                    break;
                default:
                    System.out.println("Seleção não achada.");
            }
        }
    }

