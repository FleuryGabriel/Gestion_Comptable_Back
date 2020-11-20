package com.adaming.dto;

import java.util.Date;

public class ExerciceDTO {

	private Long id;
	private String code;
	private String libelle;
	private Date dateDebut;
	private Date dateFin;
	private boolean deleted = false;
	
	public ExerciceDTO() {
	}
	
	
	public ExerciceDTO(String code, String libelle, Date dateDebut, Date dateFin) {
		this.code = code;
		this.libelle = libelle;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public ExerciceDTO(Long id, String code, String libelle, Date dateDebut, Date dateFin) {
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
