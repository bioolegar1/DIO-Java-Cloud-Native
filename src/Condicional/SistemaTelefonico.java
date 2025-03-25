package Condicional;

public class SistemaTelefonico {
    public static void main(String[] args) {

        String plano = "TURBO";

        switch (plano){
            case "BASIC":{
                System.out.println("Seu plano possui: \n 100 minutios de ligação");
            break;
            }
            case "MIDIA":{
                System.out.println("Seu plano possui: " +
                        "\n - 100 minutos de ligação" +
                        "\n - Whats e Instagram Grátis");
            break;
            }
            case "TURBO": {
                System.out.println("Seu plano possui:" +
                        "\n - Whats e Instagram grátis" +
                        "\n - 5GB Youtube");
                break;
            }
            default:{
                System.out.println("Plano invalido");
            }
        }

    }
}
