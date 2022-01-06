package TP2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestLivre {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testjpa");
		
		//Insertion d'une donnée
		EntityManager em = emf.createEntityManager();
		
		Livre unLivre = em.find(Livre.class, 3);
		System.out.println("Titre du livre : " + unLivre.getTitre() + " Nom de l'auteur : " + unLivre.getAuteur());
		
		EntityTransaction transac = em.getTransaction();
		transac.begin();
		
		Livre newLivre = new Livre();
		newLivre.setTitre("Les Fables");
		newLivre.setAuteur("La Fontaine");
		em.persist(newLivre);
		
		transac.commit();
		em.close();
		
		//Modification d'une donnée
		EntityManager em2 = emf.createEntityManager();
		
		Livre livreId5 = em2.find(Livre.class, 5);
		if (livreId5 != null) {
			livreId5.setTitre("Du plaisir dans la cuisine");
		}
		
		EntityTransaction transac2 = em2.getTransaction();
		transac2.begin();
		
		em2.merge(livreId5);
		
		transac2.commit();
		em2.close();
		
		//Requete JPQL 
		EntityManager em3 = emf.createEntityManager();
		TypedQuery<Livre> query = em3.createQuery("select l from Livre l", Livre.class);
		
		List<Livre> listePizzas = query.getResultList();
		
		for (Livre unLivreList : listePizzas) {
			//Tout les livres selon leur titre
			System.out.println(unLivreList.getTitre());
			//Tout les livres selon leur auteur
			System.out.println(unLivreList.getAuteur());
			//Tout les livres : titre et auteur
			System.out.println("Titre : " + unLivreList.getTitre() + "Auteur : " + unLivreList.getAuteur());
		}
		
		em3.close();
		
		
		//Suppression d'un livre
		EntityManager em4 = emf.createEntityManager();
		Livre livreSupp = em4.find(Livre.class, 2);
		
		EntityTransaction transac3 = em4.getTransaction();
		transac3.begin();
		
		if (livreSupp !=null) {
			em4.remove(livreSupp);
		}
		
		transac3.commit();
		em4.close();
		
		emf.close();
	}

}
