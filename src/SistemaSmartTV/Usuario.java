package SistemaSmartTV;

public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV esta ligada ? \n" + smartTV.ligada);
        System.out.println("Canal Atual: \n" + smartTV.canal);
        System.out.println("Volume da TV ? \n" + smartTV.volume);

        System.out.println(
                "====== Mudança de estado ======== \n"
        );
        smartTV.ligar();
        System.out.println("Novo status -> Ligada \n" + smartTV.ligada);

        System.out.println("\n");

        smartTV.desligar();
        System.out.println("Novo status -> Desligada \n" + smartTV.ligada);


        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Novo  status -> Aumentar Volume \n" + smartTV.volume);


        smartTV.mudarCanal(27);
        System.out.println("Canal Atual: \n" + smartTV.canal);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        System.out.println("Novo  status -> Aumentar Volume \n" + smartTV.volume);


        smartTV.aumentarCanal();
        System.out.println("Canal Atual: \n" + smartTV.canal);

    }
}