package com.adaming.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "JOURNAL")
@Entity
public class Journal {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_JOURNAL")
	private Long id;
	@Column(name = "CODE_JOURNAL")
	private String code;
	@Column(name = "LIBELLE_JOURNAL")
	private String libelle;
	@Column(name = "ISDELETED_JOURNAL")
	private boolean isDeleted = false;
	
	
	public Journal() {
	}


	public Journal(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}


	public Journal(Long id, String code, String libelle) {
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
		return isDeleted;
	}


	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	

}
