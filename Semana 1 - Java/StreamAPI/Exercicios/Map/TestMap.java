
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class TestMap {
    public static void main(String[] args) {
        Consumer<Integer> print = System.out::print;
        Consumer<String> println = System.out::print;

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);
        numeros.stream().map(n -> n * 2).forEach(print);

        List<String> marcas = Arrays.asList("fiat", "volks", "bmw");

        UnaryOperator<String> maiscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!!"; 

        marcas.stream()
            .map(maiscula)
            .map(primeiraLetra)
            .map(grito)
            .forEach(println);
    }
}
