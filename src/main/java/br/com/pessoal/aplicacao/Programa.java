package br.com.pessoal.aplicacao;

import br.com.pessoal.modelo.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {


        //instanciando o entity-manager-factory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        //instanciando o entity-manager-factory
        EntityManager em = emf.createEntityManager();


        Pessoa p = em.find(Pessoa.class, 2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        System.out.println("pronto");
        em.close();
        emf.close();


    }
}
