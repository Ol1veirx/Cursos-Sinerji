
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ListaIteradorStream {
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Ana", "Luk", "Thor", "Odin", "Freya");
        
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("Usando Iterator: ");
        //O iterator sempre verifica se existe um próximo item depois do outro
        Iterator<String> iterator = aprovados.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Usando Stream: ");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}
