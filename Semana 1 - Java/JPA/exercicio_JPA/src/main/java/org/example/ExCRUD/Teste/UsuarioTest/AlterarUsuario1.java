package org.example.ExCRUD.Teste.UsuarioTest;

import org.example.ExCRUD.Basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicio-jpa");
        EntityManager em = emf.createEntityManager();

        // Como sera feita uma alteração no banco é preciso abrir uma transação
        em.getTransaction().begin();

        // Busca por um usuario específico de acordo com seu ID
        // Logo em seguida so colocar no set os novos valores
        Usuario u1 = em.find(Usuario.class, 3L);
        u1.setNome("Dukinha Pressao");
        u1.setEmail("duka@pressao.com");
        //O metodo abaixo é responsavel por fazer esse Update
        em.merge(u1);

        System.out.println(u1.getEmail());
        // faz um commit da alteração jogando no banco
        em.getTransaction().commit();

        emf.close();
        em.close();
    }
}
