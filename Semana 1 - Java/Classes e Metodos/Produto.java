class Produto {
    String nome;
    double preco;
    final static double DESCONTO = 0.25;

    public double precoComDesconto() {
        double valorFinal = preco - (preco * DESCONTO);
        return valorFinal;
    }
}