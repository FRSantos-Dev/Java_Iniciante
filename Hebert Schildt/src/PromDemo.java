public class PromDemo {
    public static void main(String[] args) {

        byte b;
        int i;

        b =10;
        i = b *b; //Não é necessária uma coerção porque o resultado já é elevado a INT.

        b = 10;
        b = (byte)  (b * b); //Coerção é necessária para atribuir INT a um BYTE.

        System.out.println("i e b: " + i + " " + b);
    }
}
