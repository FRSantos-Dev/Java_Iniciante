public class Conta { //objeto
   private  double saldo;
    int agencia = 42;
    int numero;
    Cliente titular;
    public void deposita(double valor){ //Quando não retorna valor é VOID
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor){ //Boolean Sempre Retorna TRUE ou FALSE
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
    }else {
            return false;
        }
    }
    public boolean transfere (double valor, Conta destino) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double pegaSaldo() {
        return this.saldo;
    }
}

