package io.github.ol1veirx.domain.repository;

import io.github.ol1veirx.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

// A interface abaixo é um exemplo claro da utilização da JpaRepository
public interface Clientes extends JpaRepository<Cliente, Integer > {

    // Nesse método temos um exemplo da annotation Query que serve para fazer um consulta personalizada
    // Nessa caso será buscado no BD na tabela cliente onde o nome tenha pelos menos as letras que compoes as pesquisa
    @Query(value = " select * from cliente c where c.nome like '%:nome%' ", nativeQuery = true)
    List<Cliente> encontrarPorNome( @Param("nome") String nome );

    // Sera feita um deleção com base no nome passado
    @Query(" delete from Cliente c where c.nome =:nome ")
    @Modifying
    void deleteByNome(String nome);

    // retorna um valor booleano informando se existe ou não alguém com esse nome no BD
    boolean existsByNome(String nome);

    // Selecionar cliente trazendo o mesmo juntamente ou nao com os pedidos relacionados a ele de acordo com o id
    @Query(" select c from Cliente c left join fetch c.pedidos where c.id = :id  ")
    Cliente findClienteFetchPedidos( @Param("id") Integer id );


}
