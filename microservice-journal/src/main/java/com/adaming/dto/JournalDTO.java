package com.adaming.dto;

public class JournalDTO {
	private Long id;
	private String code;
	private String libelle;
	private boolean deleted = false;
	
	
	public JournalDTO() {
	}


	public JournalDTO(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}


	public JournalDTO(Long id, String code, String libelle) {
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


	public boolean getDeleted() {
		return deleted;
	}


	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}
