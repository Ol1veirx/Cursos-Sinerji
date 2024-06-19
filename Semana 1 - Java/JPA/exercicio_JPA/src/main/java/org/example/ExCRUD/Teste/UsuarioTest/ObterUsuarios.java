package org.example.ExCRUD.Teste.UsuarioTest;

import org.example.ExCRUD.Basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
// Consulta ao banco de dados utilizando o JPQL
public class ObterUsuarios {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicio-jpa");
        EntityManager em = emf.createEntityManager();

        // A variavel abaixo serve para armazenar a consulta feita em JPQL
        // A consulta em JPQL é feita na Classe "Usuario" e não na tabela do banco "usuarios"
        // Na verdade ela converte a consulta JPQL para SQL
        String jpql = "SELECT u FROM Usuario u";
        // Passa a consulta e o tipo de classe que ela vai retornar
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        // Limita a query para retornar no maximo 5 linhas
        query.setMaxResults(5);

        // Armazena a consulta em uma lista
        List<Usuario> usuarios = query.getResultList();

        // Percorre a lista para retornar o resultado
        for(Usuario u : usuarios) {
            System.out.println("ID: " + u.getId() + " - NOME: " + u.getNome() + " - EMAIL: " + u.getEmail());
        }

        emf.close();
        em.close();
    }
}
