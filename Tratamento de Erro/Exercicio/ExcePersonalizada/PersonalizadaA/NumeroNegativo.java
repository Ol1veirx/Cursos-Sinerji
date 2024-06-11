public class NumeroNegativo extends RuntimeException {
    private String nomeDoAtributo;

    public NumeroNegativo(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo %s esta negativo", nomeDoAtributo);
    }
}
