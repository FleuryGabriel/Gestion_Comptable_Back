package com.clientui.beans;

public class JournalBean {

	private Long id;
	private String code;
	private String libelle;
	private boolean isDeleted = false;
	
	public JournalBean() {
	}
	public JournalBean(String code, String libelle, boolean isDeleted) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.isDeleted = isDeleted;
	}
	public JournalBean(Long id, String code, String libelle, boolean isDeleted) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
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
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}
