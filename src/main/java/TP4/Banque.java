package TP4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="banque")
public class Banque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idBanque;
	private String NomBanque;
	
	public int getIdBanque() {
		return idBanque;
	}
	public void setIdBanque(int idBanque) {
		this.idBanque = idBanque;
	}
	public String getNomBanque() {
		return NomBanque;
	}
	public void setNomBanque(String nomBanque) {
		NomBanque = nomBanque;
	}
	
	
	
}
