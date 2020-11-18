package com.clientui.beans;

public class RoleBean {

	private Long id;
	private String nom;
	private boolean deleted = false;
	
	public RoleBean() {
	}
	public RoleBean(String nom, boolean deleted) {
		super();
		this.nom = nom;
		this.deleted = deleted;
	}
	public RoleBean(Long id, String nom, boolean deleted) {
		super();
		this.id = id;
		this.nom = nom;
		this.deleted = deleted;
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
