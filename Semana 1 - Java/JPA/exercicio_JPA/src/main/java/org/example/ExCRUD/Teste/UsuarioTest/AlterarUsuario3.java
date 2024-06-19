package org.example.ExCRUD.Teste.UsuarioTest;

import org.example.ExCRUD.Basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicio-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario u1 = em.find(Usuario.class, 3L);
        // Utilizando o detach passando o objeto ele torna o mesmo não gerenciado
        // Isso quer dizer que não será possivel fazer alteração sem chamar o metodo "merge"
        em.detach(u1);
        u1.setNome("Dukinha Pressao ");

        em.merge(u1);

        System.out.println(u1.getEmail());
        em.getTransaction().commit();

        emf.close();
        em.close();
    }
}
