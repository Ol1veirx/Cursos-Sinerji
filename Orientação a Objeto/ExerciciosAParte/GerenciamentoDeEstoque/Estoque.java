
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos(){
        return this.produtos;
    }

    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void removeProduto(Produto produtoRemove){
        for (Produto produto : produtos) {
            Boolean existe = produto.getId() == produtoRemove.getId();
            if(existe){
                produtos.remove(produtoRemove);
                System.out.println("Produto com id: " + produtoRemove.getId() + " removido!");
                System.out.println(listaDeProdutos());
                break;
            } else {
                System.out.println("Produto não encontrado.");
            }
        }
    }

    public void attQtdEmEstoque(int produtoId,int quantidade) {
        for(Produto produto : produtos) {
            if(produto.getId() == produtoId){
                int novaQtd = produto.getQtdEmEstoque() + quantidade;
                produto.setQtdEmEstoque(novaQtd);
            }
        }
    }

    public String listaDeProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        return "";
    }
}
