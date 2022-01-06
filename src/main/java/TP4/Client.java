package TP4;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCli;
	private String nomCli;
	private String prenomCli;
	private LocalDate dateNaissance;
	
	@Embedded
	private Adresse adresseCli;
	
	@OneToMany
	@JoinColumn(name="idBanque")
	private List<Banque> banque;
	
	@OneToMany
	@JoinColumn(name="idCompte")
	private List<Compte> compte;
	
	
	public List<Compte> getCompte() {
		return compte;
	}
	public void setCompte(List<Compte> compte) {
		this.compte = compte;
	}
	
	public List<Banque> getBanque() {
		return banque;
	}
	public void setBanque(List<Banque> banque) {
		this.banque = banque;
	}
	
	public int getIdCli() {
		return idCli;
	}
	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}
	
	public String getNomCli() {
		return nomCli;
	}
	public void setNomCli(String nomCli) {
		this.nomCli = nomCli;
	}
	
	public String getPrenomCli() {
		return prenomCli;
	}
	public void setPrenomCli(String prenomCli) {
		this.prenomCli = prenomCli;
	}
	
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public Adresse getAdresseCli() {
		return adresseCli;
	}
	public void setAdresseCli(Adresse adresseCli) {
		this.adresseCli = adresseCli;
	}
	
	
}
