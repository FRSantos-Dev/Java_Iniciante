//Demonstra switch sem instruções break
public class NoBreak {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 5; i++) {
            switch (i) {
                case 0 :
                    System.out.println("i é menor que um");
                case 1:
                    System.out.println("i é menor que um");
                case 2:
                    System.out.println("i é menor que um");
                case 3:
                    System.out.println("i é menor que um");
                case 4:
                    System.out.println("i é menor que um");
            }
            System.out.println();
        }
    }
}
