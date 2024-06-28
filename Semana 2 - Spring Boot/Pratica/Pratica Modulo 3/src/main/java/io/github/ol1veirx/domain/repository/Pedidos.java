package io.github.ol1veirx.domain.repository;

import io.github.ol1veirx.domain.entity.Cliente;
import io.github.ol1veirx.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    // Utilizando o findBy que o jpa repository entende que sera feita uma busca na tabela cliente retornando uma lista
    List<Pedido> findByCliente(Cliente cliente);
}
