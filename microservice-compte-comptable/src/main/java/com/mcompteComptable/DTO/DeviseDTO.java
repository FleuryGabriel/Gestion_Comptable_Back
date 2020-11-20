package com.mcompteComptable.DTO;



public class DeviseDTO {
	private Long id;
	private String code;
	private String nom;
	private boolean deleted=false;
	
	public DeviseDTO() {

	}
	public DeviseDTO(Long id, String code, String nom, boolean deleted) {
		this.id = id;
		this.code = code;
		this.nom = nom;
		this.deleted = deleted;
	}
	public DeviseDTO(String code, String nom, boolean deleted) {
		this.code = code;
		this.nom = nom;
		this.deleted = deleted;
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
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}
