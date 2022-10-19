import java.util.Locale;

public class ExemploCasting {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double a;
        int b;
        a = 5.0;
        b = (int)a; //Java não converte Double para Int, força usando o CASTING

        System.out.println(b);
    }
}

