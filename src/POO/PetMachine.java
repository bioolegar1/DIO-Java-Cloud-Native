package POO;

public class PetMachine {
    private boolean clean;

    private int water;

    private int shampoo;

    private Pet pet;


    public void takeAShowerInPet(){
        if(this.pet == null){
            System.out.println("Coloque o Pet na Maquina Para iniciar o Balho");
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
    }

    public void addShampoo(){
        if(shampoo == 10) {
            System.out.println("A capacidade de Shampoo da Maquina está no maximo!");
            return;
        }
        shampoo += 2;
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
        if(this.clean){
            System.out.println("A maquina está Suja, Para colocar o Pet é necessario Limpa-la");
            return;
        }
        if(hasPet()){
            System.out.println("O pet " + this.pet.getName() + " esta na Maquina nesse momento!");
            return;
        }
        this.pet = pet;
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        this.pet = null;
        System.out.println("O pet " + this.pet.getName() + " esta Limpo!");
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina está Limpa!");
    }


}
