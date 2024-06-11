
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 3.1);
        Aluno a2 = new Aluno("Gui", 3.1);
        Aluno a3 = new Aluno("Gabi", 8.1);
        Aluno a4 = new Aluno("Luna", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (n1, n2) -> {
            if(n1.nota > n2.nota) return 1;
            if(n1.nota < n2.nota) return -1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        // System.out.println(alunos.stream().min(melhorNota).get());
    }
}
