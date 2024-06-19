public class Item {
    int quantidade;
    Produto produto;

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Qtd: " + this.quantidade + " Nome: " + this.produto;
    }
}
