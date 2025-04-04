package PetMachineClanCode;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final PetMachine PET_MACHINE = new PetMachine();

    public static void main(String[] args) {
        int userChoice;
        do {
            displayMenu();
            userChoice = getUserChoice();
            processUserChoice(userChoice);
        } while (userChoice != 0);
    }

    private static void displayMenu() {
        System.out.println("Choose an option:");
        System.out.println("************************");
        System.out.println("1 - Shower Pet");
        System.out.println("2 - Refill Water");
        System.out.println("3 - Refill Shampoo");
        System.out.println("4 - Check Water Level");
        System.out.println("5 - Check Shampoo Level");
        System.out.println("6 - Check for Pet");
        System.out.println("7 - Place Pet in Machine");
        System.out.println("8 - Remove Pet from Machine");
        System.out.println("9 - Clean Machine");
        System.out.println("0 - Exit");
    }

    private static int getUserChoice() {
        return SCANNER.nextInt();
    }

    private static void processUserChoice(int choice) {
        switch (choice) {
            case 1 -> PET_MACHINE.givePetShower();
            case 2 -> PET_MACHINE.refilWater();
            case 3 -> PET_MACHINE.refilShampoo();
            case 4 -> displayWaterLevel();
            case 5 -> displayShampooLevel();
            case 6 -> checkPetPresence();
            case 7 -> placeNewPet();
            case 8 -> PET_MACHINE.removePet();
            case 9 -> PET_MACHINE.cleanMachine();
            case 0 -> exitProgram();
            default -> System.out.println("Invalid option!");
        }
    }

    private static void displayWaterLevel() {
        System.out.println("Current water level: " + PET_MACHINE.getWaterLevel() + " liters");
    }

    private static void displayShampooLevel() {
        System.out.println("Current shampoo level: " + PET_MACHINE.getShampooLevel() + " liters");
    }

    private static void checkPetPresence() {
        System.out.println(PET_MACHINE.hasPet() ? "There is a pet in the machine." : "No pet in the machine.");
    }

    private static void placeNewPet() {
        if (PET_MACHINE.hasPet()) {
            System.out.println("A pet is already in the machine! Remove it first.");
            return;
        }
        String petName = getValidPetName();
        PET_MACHINE.placePet(new Pet(petName));
    }

    private static String getValidPetName() {
        System.out.println("Enter pet name: ");
        String name = SCANNER.next();
        while (name.trim().isEmpty()) {
            System.out.println("Invalid name! Enter pet name again: ");
            name = SCANNER.next();
        }
        return name.trim();
    }

    private static void exitProgram() {
        System.out.println("Exiting program...");
        System.exit(0);
    }
}