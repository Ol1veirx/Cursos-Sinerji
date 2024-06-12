public class Produto {
    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        double precoFinal = Math.round(preco * (1 - desconto) * 100.0) / 100.0;
        return nome + " tem preco de R$" + precoFinal;
    }
}
