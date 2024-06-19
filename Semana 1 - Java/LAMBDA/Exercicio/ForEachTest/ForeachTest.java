
import java.util.Arrays;
import java.util.List;

public class ForeachTest {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        for(String nome : aprovados){
            System.out.println(nome);
        }

        aprovados.forEach(nome -> System.out.println(
            nome + "!!!"
        ));

        System.out.println("Method Reference...");
        aprovados.forEach(System.out::println);

        aprovados.forEach(nome -> meuImprimir(nome));

        aprovados.forEach(ForeachTest::meuImprimir);
    }
    
    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }
}
