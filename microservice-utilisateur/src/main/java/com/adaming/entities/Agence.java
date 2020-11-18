package com.adaming.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGENCE")
public class Agence implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_AGENCE")
	private Long id;
	@Column(name = "CODE_AGENCE")
	private String code;
	@Column(name = "LIBELLE_AGENCE")
	private String libelle;
	
	private boolean deleted = false;
	
	public Agence() {
	}
	public Agence(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}
	public Agence(Long id, String code, String libelle) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
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
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	

}
