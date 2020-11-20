package com.adaming.dto;

import java.util.Date;

import com.adaming.entities.Agence;

public class EmployeDTO {
	
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private Long cin;
	private String email;
	private Long tel;
	private float salaire;
	private boolean deleted = false;

	private Agence agence;

	public EmployeDTO() {
	}
	public EmployeDTO(String nom, String prenom, Date dateNaissance, Long cin, String email, Long tel, float salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.cin = cin;
		this.email = email;
		this.tel = tel;
		this.salaire = salaire;
	}
	public EmployeDTO(Long id, String nom, String prenom, Date dateNaissance, Long cin, String email, Long tel,
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
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	
	
	

}
