package TP3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="compo")
public class Compo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="ID_LIV")
	private Livre idLiv;
	@ManyToOne
	@JoinColumn(name="ID_EMP")
	private Emprunt idEmp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Livre getIdLiv() {
		return idLiv;
	}
	public void setIdLiv(Livre idLiv) {
		this.idLiv = idLiv;
	}
	public Emprunt getIdEmp() {
		return idEmp;
	}
	public void setIdEmp(Emprunt idEmp) {
		this.idEmp = idEmp;
	}
	
	

}
