public class CursoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Liedson");
        Aluno aluno2 = new Aluno("Joao");

        Curso curso1 = new Curso("Java completo");
        Curso curso2 = new Curso("Web 2023");

        aluno1.adicionarCurso(curso2);
        aluno1.adicionarCurso(curso1);

        aluno2.adicionarCurso(curso2);

        for (Aluno aluno : curso2.alunos) {
            System.out.println(aluno);
        }
    }
}
