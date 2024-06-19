public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int qtdEmEstoque;

    public Produto(int id, String nome, double preco, int qtdEmEstoque){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double preco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEmEstoque() {
        return this.qtdEmEstoque;
    }

    public void setQtdEmEstoque(int qtdEmEstoque) {
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public String toString(){
        return "ID: " + this.id + " / Nome: " + this.nome + " / Preco: RS" + this.preco + " / Qtd. Em Estoque: " + this.qtdEmEstoque;
    }

}
