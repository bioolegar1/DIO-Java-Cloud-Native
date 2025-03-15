package Escopo;

public class Main {
    public static void main(String[] args) {


        Conta contaCliente = new Conta();
        contaCliente.saldo = 100;
        contaCliente.imprimirSaldo();

        contaCliente.sacar(30);
        contaCliente.imprimirSaldo();


    }
}
