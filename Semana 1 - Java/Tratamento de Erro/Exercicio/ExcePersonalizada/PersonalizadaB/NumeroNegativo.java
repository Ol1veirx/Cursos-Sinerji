public class NumeroNegativo extends Exception {
    private String nomeDoAtributo;

    public NumeroNegativo(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo %s esta negativo", nomeDoAtributo);
    }
}
