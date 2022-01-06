package TP4;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	
	private int numAdresse;
	private String rue;
	private int codePostal;
	private String ville;
	
	public int getNumAdresse() {
		return numAdresse;
	}
	public void setNumAdresse(int numAdresse) {
		this.numAdresse = numAdresse;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

}
