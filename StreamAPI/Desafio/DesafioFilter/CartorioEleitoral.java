
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CartorioEleitoral {
    public static void main(String[] args) {
        // Nesse modulo nos mesmos criariamos o desafio seguindo os requisitos passados
        // Esse foi o pensando por mim
        Pessoa p1 = new Pessoa("Ana", 25, false);
        Pessoa p2 = new Pessoa("Marcos", 19, false);
        Pessoa p3 = new Pessoa("Joao", 65, true);
        Pessoa p4 = new Pessoa("Liedson", 21, true);
        Pessoa p5 = new Pessoa("Lia", 14, false);
        Pessoa p6 = new Pessoa("Duda", 32, true);

        List<Pessoa> cidadaos = Arrays.asList(p1, p2, p3, p4 , p5, p6);

        Predicate<Pessoa> ehMaiorDeIdade = p -> p.idade >= 18;
        Predicate<Pessoa> temTitulo = p -> p.temTitulo == true;
        Function<Pessoa, String> aptosParaVotar = p -> p.nome.toUpperCase() + " tem " + p.idade + " e esta apto para votar!";

        cidadaos.stream()
            .filter(ehMaiorDeIdade)
            .filter(temTitulo)
            .map(aptosParaVotar)
            .forEach(System.out::println);
    }
}
