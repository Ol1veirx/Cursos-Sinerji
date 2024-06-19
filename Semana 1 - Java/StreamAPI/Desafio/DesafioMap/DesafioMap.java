
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class DesafioMap {
    public static void main(String[] args) {
        // Desafio feito com minha resposta chegando ao resultado esperado
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<String> paraBinario = nums.stream().map(Referencias.paraBinario).collect(Collectors.toList());
        paraBinario.forEach(print);
        
        System.out.println();

        List<String> inverter = paraBinario.stream().map(Referencias.inverterValor).collect(Collectors.toList());
        inverter.forEach(print);

        System.out.println();

        List<Integer> inteiro = inverter.stream().map(Referencias.paraInteiro).collect(Collectors.toList());
        inteiro.forEach(println);

    }
}
