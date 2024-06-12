public class CaixaTest {
    public static void main(String[] args) {
        //Se eu não especificasse o tipo entre chaves eu ate poderia utilizar, mas ainda sim não seria legal
        // Por esse motivo passamos o tipo para que nos metodos tanto o parametro como o retorno seja de um tipo mais especifico
        // Nesse caso recebe e retornar string;
        Caixa<String> caixaA = new Caixa();
        caixaA.guardar("Brinquedo");
        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        // Utilizando a mesma classe eu consigo instanciar objetos de varios tipos diferentes
        Caixa<Integer> caixaB = new Caixa();
        caixaB.guardar(10);
        int coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }
}
