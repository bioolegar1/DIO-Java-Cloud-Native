package POO;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var option = -1;
        do{
            System.out.println("Escolha uma das opções:");

            System.out.println("************************");

            System.out.println("1 - Dar banho no Pet");
            System.out.println("2 - Abastecer a Maquina com Água.");
            System.out.println("3 - Abastecer a Maquina com Shampoo");
            System.out.println("4 - Verificar a Água da Maquina.");
            System.out.println("5 - Verificar o Shampooda Maquina ");
            System.out.println("6 - Verificar se tem pet no Banho");
            System.out.println("7 - Colocar pet na Maquina ");
            System.out.println("8 - Retirar pet da Maquina ");
            System.out.println("9 - Limpar a Maquina ");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 : petMachine.takeAShowerInPet();break;
                case 2 : setWater();break;
                case 3 : setshampoo();break;
                case 4 : verifyWater();break;
                case 5 : verifyShampoo();break;
                case 6 : checkIfHasPetInMachine();break;
                case 7 : setPetInPtMachine();break;
                case 8 : petMachine.removePet();break;
                case 9 : petMachine.wash();break;
                case 0 : System.exit(0);break;
                default:
                    System.out.println("Opção Invalida!");break;
            }

        }while(option != 0);
    }


    private static void setWater() {
        System.out.println("Tentando colocar Água na maquina");
        petMachine.addWater();
    }
    private static void setshampoo() {
        System.out.println("Tentando colocar Shampoo na maquina");
        petMachine.addShampoo();
    }

    private static void verifyShampoo() {
        var amout = petMachine.getShampoo();
        System.out.println("A maquina está no momento com " + amout +  "Litro(s) de shampoo");
    }
    private static void verifyWater() {
        var amout = petMachine.getWater();
        System.out.println("A maquina está no momento com " + amout +  "Litro(s) de water");
    }


    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na Máquina": "Não tem pet na Máquina");
    }


    public static void setPetInPtMachine(){
        if(petMachine.hasPet()){
            System.out.println("Já existe um pet na máquina! Remova-o antes de colocar outro.");
        return;
        }
        System.out.println("Digite o nome do pet: ");
        var name = scanner.next();
        while (name == null || name.isEmpty()){
            System.out.println("Nome inválido! Digite o nome do pet: ");
            name = scanner.next();
        }
        System.out.println("Informe o nome do pet:");
        var pet = new Pet(name);
        petMachine.setPet(pet);
    }


    public void getPetFromMachine(){
        petMachine.removePet();
    }
}
