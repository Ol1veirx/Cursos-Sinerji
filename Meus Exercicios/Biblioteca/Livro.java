
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private boolean disponivel = true;

    public Livro(String titulo, String autor, int anoPublicacao, String genero, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.disponivel = disponivel; 
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void setAnoPublicacao(int  anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean  isDisponivel(){
        return disponivel;
    }

    public void marcarLivro() {
        this.disponivel = false;
    }

    public void desmarcarLivro(){
        this.disponivel = true;
    }
}
