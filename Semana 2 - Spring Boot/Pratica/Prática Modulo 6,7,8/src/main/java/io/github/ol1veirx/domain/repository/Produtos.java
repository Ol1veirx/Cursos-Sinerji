package io.github.ol1veirx.domain.repository;

import io.github.ol1veirx.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
