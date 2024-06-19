public class DataMain {
    public static void main(String[] args) {
        Data d1 = new Data();
        Data.dia = 9;
        d1.mes = 5;
        d1.ano = 2003;

        int dia = Data.dia = 9;

        d1.dateFormat();
        System.out.println(dia);
    }
}
