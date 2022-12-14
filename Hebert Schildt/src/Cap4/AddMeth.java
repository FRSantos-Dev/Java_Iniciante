package Cap4;

public class AddMeth {
    public static void main(String[] args) {
        Veiculo minivan = new Veiculo();
        Veiculo esportivo = new Veiculo();

        int distancia1, distancia2;

        //atriui valores a campos de minivan
        minivan.passegeiros = 7;
        minivan.tanque = 16;
        minivan.km = 21;

        //atribui valores a campos de esportivo
        esportivo.passegeiros = 2;
        esportivo.tanque = 14;
        esportivo.km = 12;

        System.out.println("Minivan pode carregar " + minivan.passegeiros + ". ");

        minivan.autonomia(); //exibe autonomia da minivan

        System.out.println("Esportivo pode carregar " + esportivo.passegeiros + ". ");

        esportivo.autonomia(); //exibe autonomia do esportivo
    }
}
