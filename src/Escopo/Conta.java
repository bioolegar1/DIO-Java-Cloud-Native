package Escopo;

public class Conta {

    double saldo;

    public Conta() {
        this.saldo = saldo;
    }


    public void sacar (double valor){
        double novoSaldo = saldo -= valor;
    }

    public void imprimirSaldo () {
        System.out.println(saldo);
    }

}
