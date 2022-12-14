package Cap4;

//Essa classe declara um objeto do tipo Veiculo.
public class DoisVeiculos {
    public static void main(String[] args) {
        Veiculo minivan = new Veiculo();
        Veiculo esportivo = new Veiculo();

        int distancia1, distancia2;

        //Atribui valores a campos de minivan.
        minivan.passegeiros = 7;
        minivan.tanque = 16;
        minivan.km = 21;

        //Atribui valores a campos de esportivo.
        esportivo.passegeiros = 2;
        esportivo.tanque = 14;
        esportivo.km = 12;

        //Calcular a autonomia de cada veículo.
        distancia1 = minivan.tanque * minivan.km;
        distancia2 = esportivo.tanque * esportivo.km;

        System.out.println("Minivan pode transportar " + minivan.passegeiros +
                " com uma autonomia de " + distancia1 + " km");

        System.out.println("Esportivo pode carregar " + esportivo.passegeiros +
                " com uma autonomia de " + distancia2 + " km");
        }
    }


