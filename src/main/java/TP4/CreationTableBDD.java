package TP4;

import java.time.LocalDate;

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
		
		Banque newBanque2 = new Banque();
		newBanque2.setNomBanque("Credit Mutuelle");
		em.persist(newBanque2);
		
		Banque newBanque3 = new Banque();
		newBanque3.setNomBanque("Credit Agricole");
		em.persist(newBanque3);
		
		
		Client newClient = new Client("Garnier","Ugo",LocalDate.of(1984, 3, 12));
		Adresse newAdresse = new Adresse(56, "Rue des Plantes", 44000, "Nantes");
		newClient.setAdresseCli(newAdresse);
		newClient.setBanque(newBanque);
		em.persist(newClient);
		
		transac.commit();
		
		em.close();
		
		
		emf.close();

	}

}
