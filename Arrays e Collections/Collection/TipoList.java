
import java.util.ArrayList;

public class TipoList {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Liedson");
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Karen"));
        lista.add(new Usuario("Bia"));

        System.out.println(lista.get(2));

        lista.remove(1);

        for(Usuario u : lista) {
            System.out.println(u.nome);
        }

    }
}
