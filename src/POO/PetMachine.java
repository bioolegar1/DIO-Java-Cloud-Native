package POO;

public class PetMachine {
    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public PetMachine(){

    }

    public void takeAShowerInPet(){
        if(this.pet == null){
            System.out.println("Coloque o Pet na Maquina Para iniciar o Balho");
            return;
        }
        if(water < 10 || shampoo < 2){
            System.out.println("Água ou shampoo insuficientes para dar banho! Reabasteça a máquina.");
        return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O Pet " + pet.getName() + " esta Limpo!");
    }

    public void addWater(){
        if(water == 30) {
            System.out.println("A capacidade de água da Maquina está no maximo!");
            return;
        }
        water += 2;
        System.out.println("Água adicionada. Quantidade atual: " + water + " litros.");
    }

    public void addShampoo(){
        if(shampoo == 10) {
            System.out.println("A capacidade de Shampoo da Maquina está no maximo!");
            return;
        }
        shampoo += 2;
        System.out.println("Shampoo adicionado. Quantidade atual: " + shampoo + " litros.");
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A maquina está Suja, Para colocar o Pet é necessario Limpa-la");
            return;
        }
        if(water <= 0 || shampoo <= 0){
            System.out.println("A máquina não pode receber um pet! Água ou shampoo estão em zero. Reabasteça.");
        return;
        }
        if(hasPet()){
            System.out.println("O pet " + this.pet.getName() + " esta na Maquina nesse momento!");
            return;
        }
        this.pet = pet;
        System.out.println("Pet " + this.pet.getName() + " colocado na Maquina com Sucesso!");
    }

    public void removePet(){
        if (this.pet != null){
            if (water >= 10 && shampoo >= 2){
                this.water -= 10;
                this.shampoo -= 2;
                System.out.println("O Pet " + this.pet.getName() + " foi removido!\n Água restante: " + water + "\nShampoo restante: " + shampoo);
                this.clean = this.pet.isClean();
                this.pet = null;
            }else {
                System.out.println("Não há água ou shampoo suficiente para remover o pet! Reabasteça a máquina.");            }
        }else {
            System.out.println("Não há pet na Maquina nesse momento!");
        }
    }

    public void wash(){
        if (water < 10 || shampoo < 2) {
            System.out.println("Água ou shampoo insuficientes para limpar a máquina! Reabasteça.");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina está Limpa! Água restante: " + water + ", Shampoo restante: " + shampoo);
    }
}
