public class CalculoTest2 {
    public static void main(String[] args) {
        Calculo soma = (x, y) -> { return x + y; };
        System.out.println(soma.executar(2, 3));

        soma = (x, y) -> x * y;
        System.out.println(soma.executar(10, 10));
    }
}
