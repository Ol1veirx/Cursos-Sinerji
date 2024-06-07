public class Temperatura {
    public static void main(String[] args) {
        //(F - 32) X 5/9

        final int ajuste = 32;
        final double fator = 5 / 9.0;
        
        double f = 86;
        double celsius = (f - ajuste) * fator;
        
        System.out.println("Resposta = " + celsius);

    }
}
