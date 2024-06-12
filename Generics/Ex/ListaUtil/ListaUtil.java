
import java.util.List;

public class ListaUtil {
    //Esse tipo voce fica na esperança de conseguir fazer o cast ou não ou seja...
    // Vai receber uma lista de qualquer coisa que irá retornar um objeto no qual precisa ser feito o cast para o tipo definido lá
    public static Object getUltimo1(List<?> lista){
        return lista.get(lista.size() - 1);
    }

    // Utilizando o generics
    // Nesse caso vai receber um lista de tipo T onde irá retornar um tipo T que for especificado no momento da chamada do metodo
    public static <T> T getUltimo2(List<T> lista){
        return lista.get(lista.size() - 1);
    }

    public static <A, B, C> C test(A paramA, B paramb) {
        C teste = null;
        return teste;
    }
}
