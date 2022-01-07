package TP4;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="operation")
public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOperation;
	@Column (name = "date_operation")
	private LocalDateTime dateOpe;
	@Column (name = "montant")
	private double montant;
	@Column (name = "motif")
	private String Motif;
	@ManyToOne
	@JoinColumn(name="id_compte")
	private Compte compte;
	
	public Operation(LocalDateTime dateOpe, double montant, String motif, Compte compte) {
		super();
		this.dateOpe = dateOpe;
		this.montant = montant;
		Motif = motif;
		this.compte = compte;
	}

	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalDateTime getDateOpe() {
		return dateOpe;
	}

	public void setDateOpe(LocalDateTime dateOpe) {
		this.dateOpe = dateOpe;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getMotif() {
		return Motif;
	}

	public void setMotif(String motif) {
		Motif = motif;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
	
	
}
