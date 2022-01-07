package TP4;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column (name="nom",length = 20)
	private String nomCli;
	@Column (name="prenom",length = 20)
	private String prenomCli;
	@Column (name = "date_naissance")
	private LocalDate dateNaissance;
	
	@Embedded
	private Adresse adresseCli;
	
	@OneToOne
	@JoinColumn(name="idBanque")
	private Banque banque;
	
	@ManyToOne
	@JoinColumn(name="idCompte")
	private Compte compte;
	
	
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	public Banque getBanque() {
		return banque;
	}
	public void setBanque(Banque banque) {
		this.banque = banque;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Client(String nomCli, String prenomCli, LocalDate dateNaissance) {
		super();
		this.nomCli = nomCli;
		this.prenomCli = prenomCli;
		this.dateNaissance = dateNaissance;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	
	
	
}
