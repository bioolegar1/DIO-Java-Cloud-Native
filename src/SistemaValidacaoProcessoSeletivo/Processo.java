package SistemaValidacaoProcessoSeletivo;

public class Processo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);

    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        String resultado = salarioPretendido < salarioBase ? "LIGAR PARA CANDIDATO" :
                salarioPretendido == salarioBase ? "LIGAR PARA CANDIDATO COM CONTRA PROPOSTA":
                "AGUARDAR RESULTADO DEMAIS CANDIDATOS";
        System.out.println(resultado);
    }
}
