package org.example.ExCRUD.Teste.UsuarioTest;

import org.example.ExCRUD.Basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// O metodo serve para inserir um novo usuario no banco de dados por meio do metodo "persist"
public class NovoUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicio-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Duka", "DukinhaPressao@hotmail.com");

        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
