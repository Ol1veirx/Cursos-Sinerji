package org.example.ExCRUD.Teste.UsuarioTest;

import org.example.ExCRUD.Basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// O metodo abaixo serve para busca por um usuario no banco de dados por meio do metodo "find"
public class ObterUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicio-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 3L);
        System.out.println(usuario.getNome());

        emf.close();
        em.close();
    }
}
