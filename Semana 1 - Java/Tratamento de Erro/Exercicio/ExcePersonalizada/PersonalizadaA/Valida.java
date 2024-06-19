public class Valida {

    private Valida() {}

    public static void aluno(Aluno aluno) {
        if(aluno == null) {
            throw new IllegalArgumentException("O aluno esta nulo!");
        }

        if(aluno.nome.trim().isEmpty()) {
            throw new StringVazia("Nome");
        }

        if(aluno.nota < 0) {
            throw new NumeroNegativo("nota");
        }
    }
}
