package Condicional;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        String sobrenome;
        int idade;
        double altura;

        try {
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();

            System.out.println("Digite seu Sobrenome: ");
            sobrenome = scanner.nextLine();

            System.out.println("Digita sua idade: ");
            idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite sua altura: ");
            altura = scanner.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e alteura precisam ser numéricos");
            scanner.close();
            return;
        }
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é: " + altura + " m");

        scanner.close();
    }
}
