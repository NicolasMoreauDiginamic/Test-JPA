package TP4;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="operation")
public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOperation;
	private LocalDateTime dateOpe;
	private double montant;
	private String Motif;
	
	public int getIdOperation() {
		return idOperation;
	}
	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
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
}
