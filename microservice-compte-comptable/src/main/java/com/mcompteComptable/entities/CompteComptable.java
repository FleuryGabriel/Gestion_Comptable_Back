package com.mcompteComptable.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="COMPTE_COMPTABLE")
@Entity
public class CompteComptable implements Serializable {
		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_COMPTE_COMPTABLE")
		private Long id;
	@Column(name="CODE")
		private String code;
	@Column(name="NOM")
		private String nom;
	@Column(name="SENS")
		private String sens;
	@Column(name="DELETED")
		private boolean deleted=false;
	@OneToOne
	@JoinColumn( name="DEVISE", referencedColumnName ="ID_DEVISE")
		private Devise devise;
	
	public CompteComptable() {
	}

	public CompteComptable(Long id, String code, String nom, String sens, boolean deleted, Devise devise) {
		this.id = id;
		this.code = code;
		this.nom = nom;
		this.sens = sens;
		this.deleted = deleted;
		this.devise = devise;
	}

	public CompteComptable(String code, String nom, String sens, boolean deleted, Devise devise) {
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
	
	public Devise getDevise() {
		return devise;
	}

	public void setDevise(Devise devise) {
		this.devise = devise;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
	
}
