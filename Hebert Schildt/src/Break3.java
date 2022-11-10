//Usando break com laços aninhados
public class Break3 {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i ++){
            System.out.println("Outro loop conta: " + i);
            System.out.println("  Loop interno Conta: ");

            int t = 0;
            while(t < 100) {
                if(t == 10) break; //encerra o laço se t é 10
                System.out.println(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loops completos.");
    }
}
