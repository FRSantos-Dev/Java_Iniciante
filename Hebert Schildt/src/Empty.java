//Partes de FOR podem estar vazias
public class Empty {
    public static void main(String[] args) {
        int i;

        for(i = 0; i <10;) { //A expressão de iteração esta faltando, ao executar sem interação entra em Loop Infinito.
            System.out.println("Pass #" + i);
            i++; //Incrementa a varíavel de controle de laço
        }
    }
}
