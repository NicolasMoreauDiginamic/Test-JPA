package TP4;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Adresse {
	
	@Column (name = "num_Adresse")
	private Integer numAdresse;
	@Column (name = "rue", length = 20)
	private String rue;
	@Column (name = "code_Postal")
	private Integer codePostal;
	@Column (name = "ville", length = 20)
	private String ville;
	
	public Integer getNumAdresse() {
		return numAdresse;
	}
	public void setNumAdresse(Integer numAdresse) {
		this.numAdresse = numAdresse;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public Integer getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Adresse(Integer numAdresse, String rue, Integer codePostal, String ville) {
		this.numAdresse = numAdresse;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
