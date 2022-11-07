//Retira mais uma parte do laço FOR
public class Emprty2 {
    public static void main(String[] args) {

        int i;

        i=0; //Move a inicialização para fora do laço.
        for(; i< 10;) {
            System.out.println("Pass # " + i);
            i++; //Incrementa a varíavel de controle de laço
        }
    }
}
