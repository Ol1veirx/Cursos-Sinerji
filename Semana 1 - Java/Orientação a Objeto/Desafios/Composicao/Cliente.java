
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<>();

    public double getValorTotal() {
        double valorTotal = 0;
        for(Compra c : compras) {
            for (Item item : c.itens) {
                valorTotal += item.produto.preco * item.quantidade;
            }
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        for(Compra c : compras) {
            System.out.println(c.itens);
        }
        return "Cliente: " + nome;
    }
}
