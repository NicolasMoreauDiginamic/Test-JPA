package TP3;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestBibliotheque {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
		
		EntityManager em = emf.createEntityManager();
		
		//Tout les livres d'un emprunt
		Emprunt unEmprunt = em.find(Emprunt.class,2);
		System.out.println("Emprunt : " + unEmprunt.getId());
		List<Livre>listeLivre = unEmprunt.getLivresEmp();
		for (Livre unLivre : listeLivre) {
			System.out.println("Titre : " + unLivre.getTitre() + " / Auteur : " + unLivre.getAuteur());
		}
		
		//Tout les emprunts d'un client
		Client unClient = em.find(Client.class,3);
		System.out.println("Nom client : " + unClient.getNom() + " / Prenom : " + unClient.getPrenom());
		List<Emprunt>listeEmprunt = unClient.getEmpruntCli();
		for (Emprunt unEmpruntCli : listeEmprunt) {
			System.out.println("ID Emprunt : " + unEmpruntCli.getId());
		}
		
		em.close();

		emf.close();
	}
	
}
