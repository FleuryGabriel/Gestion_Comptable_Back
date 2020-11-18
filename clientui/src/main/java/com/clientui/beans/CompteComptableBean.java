package com.clientui.beans;

public class CompteComptableBean {

	private Long id;
	private String code;
	private String nom;
	private String sens;
	private boolean deleted;
	private DeviseBean devise;
	
	public CompteComptableBean() {
	}

	public CompteComptableBean(String code, String nom, String sens, boolean deleted, DeviseBean devise) {
		super();
		this.code = code;
		this.nom = nom;
		this.sens = sens;
		this.deleted = deleted;
		this.devise = devise;
	}

	public CompteComptableBean(Long id, String code, String nom, String sens, boolean deleted, DeviseBean devise) {
		super();
		this.id = id;
		this.code = code;
		this.nom = nom;
		this.sens = sens;
		this.deleted = deleted;
		this.devise = devise;
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

	public String getSens() {
		return sens;
	}

	public void setSens(String sens) {
		this.sens = sens;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public DeviseBean getDevise() {
		return devise;
	}

	public void setDevise(DeviseBean devise) {
		this.devise = devise;
	}
}
