package Cap4;public class VeiculoDemo {
    public static void main(String[] args) {
        Veiculo minivan = new Veiculo();
        int range;
        // atribui valores a campos de minivan
        minivan.passegeiros = 7;
        minivan.tanque = 16;
        minivan.km = 21;
        // calcula a autonomia
        range = minivan.tanque * minivan.km;
        System.out.println("Minivan pode transportar " + minivan.passegeiros +
                " com uma autonomia de " + range + " km");
    }
}
