package com.clientui.beans;

import java.util.Date;

public class ExerciceBean {

	private Long id;
	private String code;
	private String libelle;
	private Date dateDebut;
	private Date dateFin;
	private boolean isDeleted = false;
	
	public ExerciceBean() {
	}
	public ExerciceBean(String code, String libelle, Date dateDebut, Date dateFin, boolean isDeleted) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.isDeleted = isDeleted;
	}
	public ExerciceBean(Long id, String code, String libelle, Date dateDebut, Date dateFin, boolean isDeleted) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.isDeleted = isDeleted;
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
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}
