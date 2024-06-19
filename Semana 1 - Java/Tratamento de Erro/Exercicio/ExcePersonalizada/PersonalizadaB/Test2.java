public class Test2 {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Liedson", -7);
            Valida.aluno(aluno);
        } catch (StringVazia e) {
            System.out.println(e.getMessage());
        } catch (NumeroNegativo e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim");
    }
}
