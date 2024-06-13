
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Usuario {
    private String nome;
    private int idade;
    private List<Livro> livros = new ArrayList<>();

    public Usuario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void pegarLivro(Livro livro){
        if(livro.isDisponivel() == true) {
            livros.add(livro);
            livro.marcarLivro();
        } else {
            return;
        }
    }

    public void devolverLivro(Livro livro) {
        livros.remove(livro);
        livro.desmarcarLivro();
    }
}
