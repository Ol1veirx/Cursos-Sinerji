
import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 3.1);
        Aluno a2 = new Aluno("Gui", 3.1);
        Aluno a3 = new Aluno("Gabi", 8.1);
        Aluno a4 = new Aluno("Luna", 10);
        Aluno a5 = new Aluno("Gabi", 8.1);
        Aluno a6 = new Aluno("Luna", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        alunos.stream().distinct().forEach(System.out::println);

        alunos.stream().distinct().limit(2).skip(2).forEach(System.out::println);

        alunos.stream().distinct().takeWhile(a -> a.nota >= 7).forEach(System.out::println);
    }
}
