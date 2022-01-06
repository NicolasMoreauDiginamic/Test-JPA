package TP4;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="compte")
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCompte;
	private String numeroCompte;
	private double solde;
	
	@OneToMany
	@JoinColumn(name="idOperation")
	private List<Operation> operationCompte;
	
	public int getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	
	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	
	public Double getSolde() {
		return solde;
	}
	public void setSolde(Double solde) {
		this.solde = solde;
	}
	
}
