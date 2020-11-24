package com.adaming.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "EXERCICE")
@Entity
public class Exercice implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EXERCICE")
	private Long id;
	@Column(name = "CODE_EXERCICE")
	private String code;
	@Column(name = "LIBELLE_EXERCICE")
	private String libelle;
	@Column(name = "DATEDEBUT_EXERCICE")
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Column(name = "DATEFIN_EXERCICE")
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	@Column(name = "DELETED_EXERCICE")
	private boolean deleted = false;
	
	
	
	
	public Exercice() {
	}
	
	
	public Exercice(String code, String libelle, Date dateDebut, Date dateFin) {
		this.code = code;
		this.libelle = libelle;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	

	public Exercice(Long id, String code, String libelle, Date dateDebut, Date dateFin) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}	
	
	
	
}
