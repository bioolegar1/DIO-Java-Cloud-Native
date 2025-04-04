package PetMachineClanCode;

public class PetMachine {

    private static final int MAX_WATER_CAPACITY = 30;
    private static final int MAX_SHAMPOO_CAPACITY = 10;
    private static final int WATER_PER_USE = 10;
    private static final int SHAMPOO_PER_USE = 2;


    private int waterLevel = MAX_WATER_CAPACITY;
    private int shampooLevel = MAX_SHAMPOO_CAPACITY;
    private boolean isMachineClean = true;
    private Pet currentPet;


    public void givePetShower(){
        if (!hasPet()){
            System.out.println("Sem pet na Maquina Para Banho.");
            return;
        }
        if(!hasEnoughResources()) {
            System.out.println("Shampoo ou Água insuficiente para dar banho no pet! \n Por favor Recarregar a Maquina! ");
            return;
        }
        useResources();
        currentPet.markAsClean();
        System.out.println("Pet "+ currentPet.getName()+" esta Limpo!");
    }

    public void refilWater(){
        if (waterLevel >= MAX_WATER_CAPACITY) {
            System.out.println("A maquina esta na capacidade maxima de ÁGUA");
            return;
        }
        waterLevel += 2;
        System.out.println("Agua abastecida!" +
                "\nNivel atual de Água: " + waterLevel + " LITROS");
    }

    public void refilShampoo(){
        if (waterLevel >= MAX_SHAMPOO_CAPACITY) {
            System.out.println("A maquina esta na capacidade maxima de SHAMPOO");
            return;
        }
        shampooLevel += 2;
        System.out.println("Agua abastecida!" +
                "\nNivel atual de Shampoo: " + shampooLevel + " LITROS");
    }

    public void placePet(Pet pet){
        if (!isMachineClean) {
            System.out.println("A Maquina está suja, Lave antes de colocar um PET");
            return;
        }
        if (!hasEnoughResources()){
            System.out.println("Niveis de Shampoo ou Água insuficiente para dar banho no pet!");
            return;
        }
        if(hasPet()) {
            System.out.println("Pet " + currentPet.getName() + " está na Maquina, Retire-o antes de colocar outro PET");
            return;
        }
        currentPet = pet;
        System.out.println("PEt "  + pet.getName() + " colocado na Maquina com sucesso!");
    }

    public void removePet(){
        if(!hasPet()){
            System.out.println("Sem pet na Maquina Para Banho.");
            return;
        }
        if (!hasEnoughResources()){
            System.out.println("Agua ou Shampoo Insuficientes para Remover o Pet Limpo");
            return;
        }
        useResources();
        isMachineClean = currentPet.isClean();
        System.out.println("Pet " + currentPet.getName() + " esta Limpo!" +
                "\nNivel da Água" + waterLevel + " LITROS" +
                "\nNivel de Shampoo: "+ shampooLevel + " LITROS");
        currentPet = null;
    }

    public void cleanMachine() {
        if(!hasEnoughResources()){
            System.out.println("Agua ou Shampoo Insuficientes para limpar a Maquina! Reabasteça!");
            return;
        }
        useResources();
        isMachineClean = true;
        System.out.println("Machina Limpa! " +
                "\nNivel da Água" + waterLevel + " LITROS" +
                "\nNivel de Shampoo: "+ shampooLevel + " LITROS");
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public int getShampooLevel() {
        return shampooLevel;
    }

    public boolean hasPet() {
        return currentPet != null;
    }

    private boolean hasEnoughResources(){
        return waterLevel >= WATER_PER_USE && shampooLevel >= SHAMPOO_PER_USE ;
    }

    private void useResources(){
        waterLevel -= WATER_PER_USE;
        shampooLevel -= SHAMPOO_PER_USE;
    }
}