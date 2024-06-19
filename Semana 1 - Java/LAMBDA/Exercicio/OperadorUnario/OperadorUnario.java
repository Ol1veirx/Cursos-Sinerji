import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> mult = valor -> valor * 2;
        UnaryOperator<Integer> somaDois = valor -> valor + 2;
        UnaryOperator<Integer> aoQuadrado = valor -> valor * valor;

        int resultado = mult.andThen(somaDois).andThen(aoQuadrado).apply(2);
        System.out.println(resultado);

        int result2 = aoQuadrado.compose(somaDois).compose(mult).apply(2);
        System.out.println(result2);
    }
}
