package io.github.ol1veirx.service;

import io.github.ol1veirx.domain.entity.Pedido;
import io.github.ol1veirx.domain.enums.StatusPedido;
import io.github.ol1veirx.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
