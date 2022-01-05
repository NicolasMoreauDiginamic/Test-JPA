package TP3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestBibliotheque {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
		
		EntityManager em = emf.createEntityManager();
		
		

		em.close();

		emf.close();
	}
	
}
