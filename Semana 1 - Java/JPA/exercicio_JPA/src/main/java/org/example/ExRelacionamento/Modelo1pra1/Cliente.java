package org.example.ExRelacionamento.Modelo1pra1;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // OneToOne serve para dizer que o relacionamento é um pra um
    // Utilizando o cascade eu deixo as ações no banco mais automatizadas
    // Nesse caso não preciso inserir manualmente um objeto atras do outro no banco
    @OneToOne(cascade = CascadeType.PERSIST)
    // Utilizando o joinColumn eu consigo dizer as caracteristicas daquela coluna
    @JoinColumn(name = "assento_id", unique = true)
    private Assento assento;

    public Cliente() {}

    public Cliente(String nome, Assento assento) {
        this.nome = nome;
        this.assento = assento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
}
