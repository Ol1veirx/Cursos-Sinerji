package org.example.ExCRUD.Teste.UsuarioTest;

import org.example.ExCRUD.Basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExcluirUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicio-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario u1 = em.find(Usuario.class, 4L);

        // Essa é a forma de deletar um usuario
        // Sempre que formos fazer alguma ação que gere impacto (REMOVE, PERSIST e MERGE) no banco abrimos uma transqcao
        if(u1 != null) {
            em.getTransaction().begin();
            em.remove(u1);
            em.getTransaction().commit();
        }

        emf.close();
        em.close();
    }
}
