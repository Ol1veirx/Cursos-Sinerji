
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtro {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Liedson", 7.9);
        Aluno a2 = new Aluno("Ana", 6.8);
        Aluno a3 = new Aluno("Bia", 9.7);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, String> parabens = a -> "Parabens " + a.nome + "! Voce foi aprovado!";

        alunos.stream()
            .filter(aprovado)
            .map(parabens)
            .forEach(System.out::println);
    }
}
