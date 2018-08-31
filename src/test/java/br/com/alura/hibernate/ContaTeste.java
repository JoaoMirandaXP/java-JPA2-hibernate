package br.com.alura.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.hibernate.modelo.Conta;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta conta = new Conta("123", "321", "Banco do Brasil");
		System.out.println(conta);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello-world");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
