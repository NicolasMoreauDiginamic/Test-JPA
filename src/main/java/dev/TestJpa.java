package dev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testjpa");
		
		EntityManager em = emf.createEntityManager();
		
//		Pizza pizza = em.find(Pizza.class, 3);
//		System.out.println("Pizza size=" + pizza.getSize());
		

		em.close();

		emf.close();
		
	}

}
