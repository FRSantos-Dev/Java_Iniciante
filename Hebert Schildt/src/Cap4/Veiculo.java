package Cap4;

public class Veiculo {

    int passegeiros; // número de passageiros
    int tanque; // capacidade do tanque de combustível
    int km; // autonomia do veículo em km/l

    //Exibe a autonomia do veículo
    void autonomia() {
        System.out.println("Autonomia do veículo é " + tanque * km + " km");
    }
}
