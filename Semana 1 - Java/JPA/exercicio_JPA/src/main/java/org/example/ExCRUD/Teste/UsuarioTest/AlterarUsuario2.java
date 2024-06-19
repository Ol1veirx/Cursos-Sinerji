package org.example.ExCRUD.Teste.UsuarioTest;

import org.example.ExCRUD.Basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicio-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Essa classe foi criado para mostrar que quando se esta no estado gerenciado é possivel sim fazer alteração
        // Mesmo que não chame o merge ou abra a transacao depois dos SETs ele vai sim alterar no banco
        Usuario u1 = em.find(Usuario.class, 3L);
        u1.setNome("Dukinha Pressao");

        //em.merge(u1);

        System.out.println(u1.getEmail());
        em.getTransaction().commit();

        emf.close();
        em.close();
    }
}
