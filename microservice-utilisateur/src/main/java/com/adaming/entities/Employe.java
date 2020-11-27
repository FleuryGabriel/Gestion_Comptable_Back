package com.adaming.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMPLOYE")
public class Employe implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EMPLOYE")
	private Long id;
	@Column(name = "NOM_EMPLOYE")
	private String nom;
	@Column(name = "PRENOM_EMPLOYE")
	private String prenom;
	@Column(name = "DATENAISSANCE_EMPLOYE")
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	@Column(name = "CIN_EMPLOYE")
	private Long cin;
	@Column(name = "EMAIL_EMPLOYE", unique=true)
	private String email;
	@Column(name = "TEL_EMPLOYE")
	private Long tel;
	@Column(name = "SALAIRE_EMPLOYE")
	private float salaire;
	@Column(name = "PHOTO_EMPLOYE")
	@Lob
	private byte[] photo;
	
	private boolean deleted = false;
	
	@ManyToOne
	@JoinColumn(name = "AGENCE_ID", referencedColumnName = "ID_AGENCE")
	private Agence agence;
	
	
	public Employe() {
	}
	public Employe(String nom, String prenom, Date dateNaissance, Long cin, String email, Long tel, float salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.cin = cin;
		this.email = email;
		this.tel = tel;
		this.salaire = salaire;
	}
	public Employe(Long id, String nom, String prenom, Date dateNaissance, Long cin, String email, Long tel,
			float salaire) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.cin = cin;
		this.email = email;
		this.tel = tel;
		this.salaire = salaire;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Long getCin() {
		return cin;
	}
	public void setCin(Long cin) {
		this.cin = cin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	
	
	

}
