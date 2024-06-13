
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public void registrarUser(Usuario usuario){
        usuarios.add(usuario);
    }
}
