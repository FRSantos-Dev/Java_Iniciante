//Outro exemplo do uso de break com um rótulo.
public class Break5 {
    public static void main(String[] args) {

    done:
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j ++){
                for(int k = 0; k < 10; k++){
                    System.out.println(k + " ");
                    if( k == 5) break done; // desva para done
                }
                System.out.println("Após o k loop"); //não será executado
            }
            System.out.println("Após o j loo "); //não será executado
        }
        System.out.println("Após i loop");
    }
}
