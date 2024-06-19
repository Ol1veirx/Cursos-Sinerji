
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("js", "php", "java", "C++");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        // Esse exemplo não utiliza o generics
        // Os metodos passados recebe uma lista de "qualquer coisa (?)" e retorna um Object onde esse object precisa ser definido explicitamente o seu tipo, como é o caso apresentado.
        String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem);

        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero);


        // Observer no modelo abaixo que utilizando os metodos que foram construido utilizando generics não precisa fazer o cast informando o tipo;
        // A partir do tipo da lista que foi criada e passada no metodos e armazenado em uma variável do mesmo tipo da lista passada ele mesmo consegue detectar automaticamente
        String ultimaLang2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLang2);

        Integer ultimoNum2 = ListaUtil.getUltimo2(nums);
        System.out.println(ultimoNum2);
    }
}
