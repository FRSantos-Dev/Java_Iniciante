public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira:" + primeiraConta.saldo);
        Conta segundaConta = primeiraConta; //Referenciando a primeira conta
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);
        segundaConta.saldo += 100; //Acrescentando saldo
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);
        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("são a mesmissima conta");
        }

        System.out.println(primeiraConta);
    }
}
