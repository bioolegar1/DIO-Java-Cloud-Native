package SistemaValidacaoProcessoSeletivo;

import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MARIA", "JULIA", "PAULO", "AUGUSTO" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }


    }

    static void entrandoEmContato (String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA" );
        }else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MAXIMO DE TENTATIVAS: " + tentativasRealizadas);
        }

    }


    //metodo de ligaçao para medir o atendimento
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecioandos() {
        String [] candidatos = {
                "FELIPE",
                "MARIA",
                "JULIA",
                "PAULO",
                "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº:" + (i+1) + " é: " + candidatos[i]);
        }

        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

}
