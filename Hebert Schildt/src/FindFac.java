import com.sun.security.jgss.GSSUtil;

/*
Usa laços aninhados para encontrar os fatores
dos números de 2 a 100.
 */
public class FindFac {
    public static void main(String[] args) {

        for( int i = 2; i <= 100;  i++){
            System.out.println("Fatores de " + i + ": ");
            for(int j =2; j< i; j++)
                if((i%j) == 0) System.out.println(j + " ");
            System.out.println();
        }
    }
}
