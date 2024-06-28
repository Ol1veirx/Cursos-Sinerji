package io.github.ol1veirx.domain.repository;

import io.github.ol1veirx.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface básica utilizando os metodos ja existentes na Jpa Repository
public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
