package TP4;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CreationTableBDD {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transac = em.getTransaction();
		transac.begin();
		
		Banque newBanque = new Banque();
		newBanque.setNomBanque("BNP Paribas");
		em.persist(newBanque);
		
		transac.commit();
		
		em.close();
		
		emf.close();

	}

}
