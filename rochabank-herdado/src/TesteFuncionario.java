public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario felipe = new Funcionario(); //Quando não se cria um construtor o compilador insere um padrão.
        felipe.setNome("Felipe Rocha");
        felipe.setCpf("12345678-9");
        felipe.setSalario(3000.00);

        System.out.println(felipe.getNome());
        System.out.println(felipe.getBonificacao());


    }
}
