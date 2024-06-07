public class CalculoTest1 {
    public static void main(String[] args) {
        Calculo soma = new Soma();
        System.out.println(soma.executar(2, 4));

        Calculo multiplicar = new Multiplicar();
        System.out.println(multiplicar.executar(2, 3));

    }
}
