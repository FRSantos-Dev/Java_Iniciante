//Usa continue
public class ContinueDemo {
    public static void main(String[] args) {
        int i;

        //exibe os números pares entre 0 e 100
        for( i = 0; i <= 100; i++){
            if ( (i%2) != 0) continue; // iterar
            System.out.println(i);
        }
    }
}
