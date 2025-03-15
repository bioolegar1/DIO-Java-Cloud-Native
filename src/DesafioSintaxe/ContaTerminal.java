package DesafioSintaxe;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bem vindo ao Banco DIO");
        System.out.println("Por favor digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ",\n Obrigado por criar uma conta em nosso Banco DIO!," +
                "\n Sua agência é: "
                + agencia + ",\n Conta: " + numero + "\n Seu saldo " + saldo + " já está disponível para saque.";


        System.out.println(mensagem);

        scanner.close();

    }
}
