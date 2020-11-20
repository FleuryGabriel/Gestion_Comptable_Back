package com.adaming.dto;

public class RoleDTO {
	
	private Long id;
	private String nom;
	private boolean deleted = false;
	
	public RoleDTO() {
	}
	public RoleDTO(String nom) {
		this.nom = nom;
	}
	public RoleDTO(Long id, String nom) {
		this.id = id;
		this.nom = nom;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
