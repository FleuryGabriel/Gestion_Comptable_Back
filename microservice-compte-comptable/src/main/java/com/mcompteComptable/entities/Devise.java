package com.mcompteComptable.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="DEVISE")
@Entity
public class Devise implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_DEVISE")
	private Long id;
	@Column(name="CODE")
	private String code;
	@Column(name="NOM")
	private String nom;
	@Column(name="DELETED")
	private boolean deleted;
	public Devise() {

	}
	public Devise(Long id, String code, String nom, boolean deleted) {
		super();
		this.id = id;
		this.code = code;
		this.nom = nom;
		this.deleted = deleted;
	}
	public Devise(String code, String nom, boolean deleted) {
		super();
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
