public class Test {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Jose");
        resultadoConcurso.adicionar(4, "Pedro");
        resultadoConcurso.adicionar(4, "Gui");

        System.out.println(resultadoConcurso.getValor(2));
        System.out.println(resultadoConcurso.getValor(4));
    }
}
