package com.clientui.beans;

public class AgenceBean {

	private Long id;
	private String code;
	private String libelle;
	private boolean deleted = false;
	
	public AgenceBean() {
	}
	public AgenceBean(String code, String libelle, boolean deleted) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.deleted = deleted;
	}
	public AgenceBean(Long id, String code, String libelle, boolean deleted) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
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
