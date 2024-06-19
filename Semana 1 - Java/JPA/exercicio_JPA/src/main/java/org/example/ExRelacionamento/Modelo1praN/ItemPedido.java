package org.example.ExRelacionamento.Modelo1praN;

import org.example.ExCRUD.Basico.Produto;

import javax.persistence.*;

@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.EAGER) // valor default (ToOne -> EAGER)
    private Produto produto;

    @Column(nullable = false)
    private int qtd;
    @Column(nullable = false)
    private Double preco;

    public ItemPedido() {}

    public ItemPedido(Pedido pedido, Produto produto, int qtd) {
        this.setPedido(pedido);
        this.setProduto(produto);
        this.setQtd(qtd);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;

        if(produto != null && this.preco == null) {
            this.setPreco(produto.getPreco());
        }
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
