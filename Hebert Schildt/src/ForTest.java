//Executa um laço até o S ser digitado.
public class ForTest {
    public static void main(String[] args)
        throws java.io.IOException {
            int i;
            System.out.println("Aperte S para parar.");

            for (i = 0; (char) System.in.read() != 'S'; i++)
                System.out.println("Pass #" + i);
        }
}
