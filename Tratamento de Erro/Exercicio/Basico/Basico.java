public class Basico {
    public static void main(String[] args) {

        String aluno = "";

        imprimriAluno(aluno);
        
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {

            throw new ArithmeticException(e.getMessage());
        }
    }

    public static void imprimriAluno(String aluno){
        System.out.println(aluno);
    }
}
