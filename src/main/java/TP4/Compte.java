package TP4;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="compte")
public class Compte {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String numero;
	
	private Double solde;
	
	@ManyToMany
	@JoinTable(name="compte_client",
		joinColumns=@JoinColumn(name="id_compte", referencedColumnName="id"),
		inverseJoinColumns=@JoinColumn(name="id_client", referencedColumnName="id")
	)
	private Set<Client>clients;
	
	@OneToMany(mappedBy="compte")
	private Set<Operation> montants;
	
	
	
	public Compte(String numero, Double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}

	//Getter et Setter
	
	

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public Set<Operation> getMontants() {
		return montants;
	}

	public void setMontants(Set<Operation> montants) {
		this.montants = montants;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	

	
	
}
