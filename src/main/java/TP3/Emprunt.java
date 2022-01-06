package TP3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="emprunt")
public class Emprunt {
	
	@Id
	private int id;
	@Column(name = "DATE_DEB", nullable = false)
	private LocalDateTime dateDeb;
	@Column(name = "DATE_FIN")
	private LocalDateTime dateFin;
	@Column(name = "DELAI")
	private int delai;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client idClient;
	
	@ManyToMany
	@JoinTable(name = "compo", 
		joinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"), 
		inverseJoinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"))
	private List<Livre> livresEmp;
	
	
	public List<Livre> getLivresEmp() {
		return livresEmp;
	}
	public void setLivresEmp(List<Livre> livresEmp) {
		this.livresEmp = livresEmp;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDateDeb() {
		return dateDeb;
	}
	public void setDateDeb(LocalDateTime dateDeb) {
		this.dateDeb = dateDeb;
	}
	public LocalDateTime getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}
	public int getDelai() {
		return delai;
	}
	public void setDelai(int delai) {
		this.delai = delai;
	}
	public Client getIdClient() {
		return idClient;
	}
	public void setIdClient(Client idClient) {
		this.idClient = idClient;
	}
	
	
}
