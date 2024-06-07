public class Data {
    static int dia = 3;
    int mes;
    int ano;

    public Data() {
        this.mes = 1;
        this.ano = 1970;
    }

    public Data(int dia, int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
    }

    public String dataFormatada() {
        String dataF = this.dia + "/" + this.mes + "/" + this.ano;
        return dataF;
    }

    public String dateFormat() {
        return String.format("%d/%d/%d", dia, this.mes, this.ano);
    }
}
