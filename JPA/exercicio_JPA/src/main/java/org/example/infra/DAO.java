package org.example.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO<E> {

    private  static EntityManagerFactory emf;
    private static EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("exercicio-jpa");
        } catch (Exception e) {
            // log
        }
    }

    public DAO() {
        this(null);
    }

    public DAO(Class<E> classe) {
        this.classe = classe;
        em = emf.createEntityManager();
    }

   public DAO<E> abrirT() {
        em.getTransaction().begin();
        return this;
   }

   public DAO<E> fecharT() {
        em.getTransaction().commit();
        return this;
   }

   public DAO<E> inserir(E entidade) {
        em.persist(entidade);
        return this;
   }

    public DAO<E> inserirDiretamente(E entidade) {
        return this.abrirT().inserir(entidade).fecharT();
    }

    public E obterPorId(Object id) {
        return em.find(classe, id);
    }

    public List<E> obterTodos() {
        return this.obterTodos(10, 0);
    }

    public List<E> obterTodos(int qtdRegistro, int deslocamento) {
        if(classe == null) {
            throw new UnsupportedOperationException("Classe nula");
        }
        String jpql = "SELECT e FROM " + classe.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(qtdRegistro);
        query.setFirstResult(deslocamento);
        return query.getResultList();
    }

    public void fechar() {
        em.close();
    }
}
