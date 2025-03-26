package Condicional;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765060");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep nao corresponde a regra de negocio");        }
    }


    static String formatarCep(String cep)  throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        return "23.765-064";
    }

}
